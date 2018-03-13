/**
 * 1.在加载时执行类的静态代码块，先加载父类，再加载子类。
 * 2.加载完成类之后再执行main方法。
 * 3.如果有类的构造，先执行父类的构造方法以及构造代码块，在执行子类的构造方法和构造代码块，构造代码块比构造方法先执行
 */
class HelloA {

    public HelloA() {
        System.out.println("HelloA");
    }

    {
        System.out.println("I'm A class");
    }

    static {
        System.out.println("static A");
    }

}

public class HelloB extends HelloA {

    public HelloB() {
        System.out.println("HelloB");
    }

    {
        System.out.println("I'm B class");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        System.out.println("In main before new");
        new HelloB();
        System.out.println("In main after new");

    }
}