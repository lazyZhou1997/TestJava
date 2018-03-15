package edu.scu;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 简单的测试和使用HashMap，通过此方法效率高于先取key，再通过key取value得方法
 */
public class TestJava {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        hashMap.put("1",new Integer(1));
        hashMap.put("2",(Integer)2);
        hashMap.put("3","2");


        Iterator iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()){

            System.out.println(((Map.Entry)(iterator.next())).getValue());

            //测试不通过迭代器修改是否会抛出异常
            //hashMap.remove("1");
        }
    }
}
