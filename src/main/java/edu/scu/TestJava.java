package edu.scu;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射机制实例化一个类对象
 */
public class TestJava implements Serializable {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class clazz = null;

        clazz = Class.forName("edu.scu.User");

        //调用默认构造方法实例化，再调用set方法赋值，如果没有默认的构造方法就会抛出异常
        User user = (User) clazz.newInstance();
        user.setAge(18);
        user.setName("Piter");
        System.out.println(user);

        //第二种方法，取得构造方法后利用构造方法赋值
        Class[] types;
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor consturctor :
                constructors) {

            types = consturctor.getParameterTypes();

            System.out.println("con(");

            for (Class type :
                    types) {

                System.out.println(type.getName());
            }

            System.out.println(")");

        }

        //构造方法的索引位置与声明时的相对位置有关
        //通过构造方法1赋值
        user = null;
        user = (User) constructors[1].newInstance("hah");
        System.out.println(user);

        //通过构造方法2赋值
        user = null;
        user = (User) constructors[0].newInstance(10,"heihei1");
        System.out.println(user);//通过构造方法2赋值

        //通过构造方法3赋值
        user = null;
        user = (User) constructors[2].newInstance();
        System.out.println(user);



    }

}

class User {

    private int age;

    private String name;

    public User() {
        System.out.println("默认构造方法！");
    }

    public User(String name) {
        this.name = name;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}