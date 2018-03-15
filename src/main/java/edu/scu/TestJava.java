package edu.scu;


/**
 * 学习泛型，受限制的类泛型
 */
public class TestJava {

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        //没有实现Comparable接口的类不能使用
        //Box<TestJava> testJavaBox = new Box<TestJava>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}

class Box<T extends Comparable<T>>{

    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

}
