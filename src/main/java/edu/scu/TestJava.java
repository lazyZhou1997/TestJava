package edu.scu;


/**
 * 学习泛型，基础的泛型方法
 */
public class TestJava {

    public static void main(String[] args) {

        //创建不同类型的数组：Integer，Double 和 Character
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4};
        Character[] characterArray = {'H','E','L','L','O'};

        TestJava testJava = new TestJava();

        testJava.printArray(intArray);
        testJava.printArray(doubleArray);
        testJava.printArray(characterArray);


    }

    /**
     * 测试泛型数组
     * @param inputArray
     * @param <T>
     */
    public <T> void printArray(T[] inputArray){

        //输出数组中的元素
        for (T t:
             inputArray) {
            System.out.print(t);
        }

        System.out.println();
    }

}
