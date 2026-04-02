package JspiderCodes.ProgMock020923;
// 1. write a java program to show overriding
class Demo1 {
    void test(){
        System.out.println("test() in Demo1 class");
    }
}
class Demo2 extends Demo1 {
    @Override
    void test(){
        System.out.println("test() in Demo2 class");
    }
}

public class Overriding{
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        d1.test();
    }
}