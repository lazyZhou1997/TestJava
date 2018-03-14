package edu.scu;

/**
 * 测试Java抽象类中抽象方法的可以使用的修饰符
 */
public class TestJava {

    public static void main(String[] args) {

    }
}

abstract class TestAbstractMethod{

    //抽象方法不能使用private
    private abstract void testPrivate();

    //非抽象方法可以是private
    private void testPrivate(int a){

    }

    //protected可以是抽象的
    protected abstract void testProtected();



}

