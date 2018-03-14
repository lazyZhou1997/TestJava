package edu.scu;

/**
 * 测试Java的基本类型运算时的自动类型转换
 */
public class TestJava {
    public static void main(String[] args) {

        byte a1 = 21, a2 = 4, a3;
        short s = 16;
        a2 = s;
        a3 = a1 * a2;

    }
}
