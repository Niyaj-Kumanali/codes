package JspiderCodes;

class Pen {
    String brand;
    String color;
    double price;
}

public class MainClass12 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.brand = "cello";
        p1.color = "pink";
        p1.price = 25;

        System.out.println(p1.brand);
        System.out.println(p1.color);
        System.out.println(p1.price);

        System.out.println("=============================================");

        Pen p2 = new Pen();
        p2.brand = "raynolds";
        p2.color = "black";
        p2.price = 35;

        System.out.println(p2.brand);
        System.out.println(p2.color);
        System.out.println(p2.price);
    }
}
