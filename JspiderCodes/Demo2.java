package JspiderCodes;

class Demo2 {
    static int x = 10;

    static void disp(){
        System.out.println("running disp() method");
    }
}

class Demo3 {
    static void test(){
        System.out.println("running test() method");
        System.out.println("x value is "+Demo2.x);
        Demo2.disp();
        Demo2.x = 100;
    }
}
