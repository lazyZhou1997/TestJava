package edu.scu;


import java.io.*;

/**
 * 学习反射加载类对象，反射获取父类和接口类对象
 */
public class TestJava implements Serializable{

    public static void main(String[] args) throws ClassNotFoundException {

        //获取Class对象的三种方式
        Class clazz1 = null;
        Class clazz2 = null;
        Class clazz3 = null;

        //通过完全类名进行加载，最常使用
        clazz1 = Class.forName("edu.scu.TestJava");
        clazz2 = new TestJava().getClass();
        clazz3 = TestJava.class;


        System.out.println(clazz1.getName());
        System.out.println(clazz2.getName());
        System.out.println(clazz3.getName());

        System.out.println("==============获取父类和接口===============");
        //获取父类
        Class parentClazz = clazz1.getSuperclass();
        System.out.println("父类为:" + parentClazz.getName());

        //获取所有接口
        Class[] interfaces = clazz1.getInterfaces();
        System.out.println("实现的接口有：");

        for (Class clazz:
             interfaces) {

            System.out.println(clazz.getName());
        }


        System.out.println("==============实例化对象===============");

    }
}