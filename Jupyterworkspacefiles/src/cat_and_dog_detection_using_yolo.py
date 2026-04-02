import cv2
import numpy as np
import os
from ultralytics import YOLO

net = cv2.dnn.readNet(r"C:\Users\TP_USER\Jupyter_workspace\yolov3.weights",
                      r"C:\Users\TP_USER\Jupyter_workspace\yolov3.cfg")

with open(r"C:\Users\TP_USER\Jupyter_workspace\coco.names", "r") as f:
    classes = [line.strip() for line in f.readlines()]

layer_names = net.getLayerNames()
output_layers = [layer_names[i - 1] for i in net.getUnconnectedOutLayers()]


def detect_image(image, confidence_threshold=0.5, nms_threshold=0.4):
    height, width, _ = image.shape

    blob = cv2.dnn.blobFromImage(image, 0.00392, (416, 416), (0, 0, 0), True, crop=False)
    net.setInput(blob)

    outs = net.forward(output_layers)

    class_ids = []
    confidences = []
    boxes = []

    for out in outs:
        for detection in out:
            scores = detection[5:]
            class_id = np.argmax(scores)
            confidence = scores[class_id]

            ids = set()
            for id, name in enumerate(classes):
                if name == 'cat':
                    ids.add(id)
                if name == 'dog':
                    ids.add(id)

            if confidence > confidence_threshold and class_id in ids:
                center_x = int(detection[0] * width)
                center_y = int(detection[1] * height)
                w = int(detection[2] * width)
                h = int(detection[3] * height)
                x = int(center_x - w / 2)
                y = int(center_y - h / 2)
                boxes.append([x, y, w, h])
                confidences.append(float(confidence))
                class_ids.append(class_id)
            else:
                center_x = int(detection[0] * width)
                center_y = int(detection[1] * height)
                w = int(detection[2] * width)
                h = int(detection[3] * height)
                x = int(center_x - w / 2)
                y = int(center_y - h / 2)
                boxes.append([x, y, w, h])
                confidences.append(float(confidence))
                class_ids.append(class_id)

    indexes = cv2.dnn.NMSBoxes(boxes, confidences, confidence_threshold, nms_threshold)
    detected_objects = []

    for i in range(len(boxes)):
        if i in indexes:
            x, y, w, h = boxes[i]
            detected_objects.append({'class_id': class_ids[i], 'confidence': confidences[i], 'box': [x, y, w, h]})
    return detected_objects


path = r"C:\Users\TP_USER\Jupyter_workspace\data\archive_test"


def label_data(path):
    for folder in os.listdir(path):
        if folder in ['test_set', 'training_set', 'valid']:
            path_for_sets = os.path.join(path, folder)
            for sub_folder in os.listdir(path_for_sets):
                if sub_folder in ["cats", "dogs"]:
                    path_for_cat_and_dogs = os.path.join(path_for_sets, sub_folder)
                    for file in os.listdir(path_for_cat_and_dogs):
                        if file.endswith(".jpg") or file.endswith(".png"):
                            image_path = os.path.join(path_for_cat_and_dogs, file)
                            image = cv2.imread(image_path)
                            detected_objects = detect_image(image)

                            label_file_path = os.path.splitext(image_path)[0] + ".txt"
                            with open(label_file_path, "w") as label_file:
                                for obj in detected_objects:
                                    class_id = obj['class_id']
                                    if class_id == 15:
                                        class_id = 0
                                    elif class_id == 16:
                                        class_id = 1
                                    else:
                                        class_id = 2
                                    x, y, w, h = obj['box']
                                    confidence = obj["confidence"]

                                    x_center = (x + w / 2) / image.shape[1]
                                    y_center = (y + h / 2) / image.shape[0]
                                    width = w / image.shape[1]
                                    height = h / image.shape[0]

                                    print(f"{label_file_path} labelled as {class_id}")

                                    label_file.write(f"{class_id} {x_center} {y_center} {width} {height}\n")

    print("Successfully labelled")


label_data(path)

model = YOLO(r"C:\Users\TP_USER\Jupyter_workspace\yolov8n.pt")
model.train(data=r"C:\Users\TP_USER\Jupyter_workspace\data\archive_test\catsanddogs.yaml", epochs=25, imgsz=416)
path = model.export()

print("successfully trained")


# model = YOLO(r"C:\Users\TP_USER\Jupyter_workspace\src\runs\detect\train3\weights\best.pt")


def detect_and_visualize(image_path):
    results = model(image_path)
    class_ids = results[0].boxes.cls.cpu().detach().numpy().astype(np.int32).tolist()  # it contain classes
    boxes = results[0].boxes.xyxy.cpu().detach().numpy().astype(np.int32).tolist()  # it contain boxes
    image = cv2.imread(image_path)

    for class_id, box in zip(class_ids, boxes):
        x, y, w, h = box

        color = (0, 255, 0)
        cv2.rectangle(image, (x, y), (w, h), color, 2)

        label = f"{['CAT' if class_id == 0 else 'DOG' if class_id == 1 else 'Other'][0]}"
        cv2.putText(image, label, (x, y - 10), cv2.FONT_HERSHEY_SIMPLEX, 0.5, color, 1)

    cv2.imshow("Output", image)
    cv2.waitKey(1)
    cv2.destroyAllWindows()


dir_path = r"C:\Users\TP_USER\Jupyter_workspace\data\archive_test\test_set\cats"

for file in os.listdir(dir_path):
    if file.endswith("jpg") or file.endswith("jpg"):
        detect_and_visualize(os.path.join(dir_path, file))


def visualize_by_video():
    video = cv2.VideoCapture(0)

    while True:
        conf, frame = video.read()
        results = model(frame)
        class_ids = results[0].boxes.cls.cpu().detach().numpy().astype(np.int32).tolist()  # it contain classes
        boxes = results[0].boxes.xyxy.cpu().detach().numpy().astype(np.int32).tolist()  # it contain boxes
        image = frame

        for class_id, box in zip(class_ids, boxes):
            x, y, w, h = box

            color = (0, 255, 0)
            cv2.rectangle(image, (x, y), (w, h), color, 2)

            label = f"{['CAT' if class_id == 0 else 'DOG'][0]}"
            cv2.putText(image, label, (x, y - 10), cv2.FONT_HERSHEY_SIMPLEX, 0.5, color, 1)

        cv2.imshow("Output", image)
        if cv2.waitKey(1) == ord('q'):
            cv2.destroyAllWindows()
            break

# visualize_by_video()
