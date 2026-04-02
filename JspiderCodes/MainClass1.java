package JspiderCodes;

class Demo1 {
    static int x = 10;
    static double y = 3.4;

    static void test(){
        System.out.println("running test() method");
    }
}

class MainClass1{
    static int x = 10;
    public static void main(String[] args) {
        System.out.println("Main method started");
        System.out.println("x values is "+Demo1.x);
        System.out.println("y values is "+Demo1.y);
        Demo1.test();
        System.out.println("Modifying x and y");
        Demo1.x = 25;
        Demo1.y = 45.34;
        System.out.println("x values is "+Demo1.x);
        System.out.println("y values is "+Demo1.y);
        System.out.println("Main method ended");

    }
}
