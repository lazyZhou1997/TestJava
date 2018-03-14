package edu.scu;

/**
 * 当子类没有与之同名的static变量（或方法时），子类的对象也可以操控这块内存空间。
 * 但是子类并没有继承父类中static修饰的变量和方法。因为static修饰的变量和方法是属于父类本身的。
 *
 * 当存在继承关系时，父类中有一个static修饰的变量（或方法），而子类中也存在一个同名的static修饰的变量（或方法）时，他们到底是否满足“重写”，
 * 不满足重写效果，但是可以分别调用父类和子类的静态方法
 */
public class TestJava {

    public static void main(String[] args) {
        Parent son = new Son();
        son.testStaticMethod();//只能调用父类的静态方法

        Son s = (Son) son;
        s.teststaticMethod();//调用父类的静态方法
        s.testStaticMethod();//调用子类的静态方法

    }
}

/**
 * 父类
 */
class Parent{

    public static void testStaticMethod(){
        System.out.println("Parent static method run!");
    }

    public void method(){
        System.out.println("Parent method run!");
    }
}

/**
 * 子类
 */
class Son extends Parent{
    public static  void  teststaticMethod(){
        System.out.println("Son's static method run!");
    }

    public void method() {
        System.out.println("Son method run!");
    }
}
