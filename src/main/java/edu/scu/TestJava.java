package edu.scu;

import java.io.FileNotFoundException;

/**
 * 测试子类覆盖父类的方法时，只能比父类抛出更少的checked异常，或者是抛出父类抛出的异常的子异常
 */
public class TestJava {

    public static void main(String[] args) throws FileNotFoundException {

        Parent son = new Son();
        son.method();
    }
}

/**
 * 父类
 */
class Parent {
    public void method() throws FileNotFoundException {

    }
}

/**
 * 子类
 */
class Son extends Parent {

    public void method() throws Exception{
        System.out.println("something!");
    }

}
