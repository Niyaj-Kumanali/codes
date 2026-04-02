package JspiderCodes;

public class MainClass3 {
    public static void main(String[] args) {
        System.out.println(new Demo4().p);
        new Demo4().p = 20;
        System.out.println(new Demo4().p);
        new Demo4().p = 30;
    }
}

class Demo4 {
    int p = 10;
    void test() {
        System.out.println("running test() method");
    }
}
