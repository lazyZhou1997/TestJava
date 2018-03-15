package edu.scu;


/**
 * 学习泛型，受类型限制的泛型方法
 */
public class TestJava {

    public static void main(String[] args) {

        TestJava testJava = new TestJava();

        System.out.printf( "Max of %d, %d and %d is %d\n\n",
                3, 4, 5, testJava.maximum( 3, 4, 5 ) );

        System.out.printf( "Maxm of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, testJava.maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "Max of %s, %s and %s is %s\n","pear",
                "apple", "orange", testJava.maximum( "pear", "apple", "orange" ) );

    }

    /**
     * 求最大值
     * @param x
     * @param y
     * @param z
     * @param <T>
     * @return
     */
    public <T extends Comparable<T>> T maximum(T x, T y,T z){
        //假定x是最大值
        T max = x;
        //先比较max和y
        if (max.compareTo(y)>0){
            max = y;
        }
        //再比较max与z
        if (max.compareTo(z)>0){
            max = z;
        }

        return max;
    }

}
