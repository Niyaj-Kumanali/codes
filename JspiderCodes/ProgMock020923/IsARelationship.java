package JspiderCodes.ProgMock020923;
// 2. write a java program to show Is-a relationship between abstract class/interface and concrete class
interface Example1 {
    void test();
}
class Sample1 implements Example1 {
    @Override
    public void test(){
        System.out.println("test() implemented in Sample1 class");
    }
}

public class IsARelationship {
    public static void main(String[] args) {
        Sample1 s1 = new Sample1();
        s1.test();
    }
}
