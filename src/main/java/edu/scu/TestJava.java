package edu.scu;


/**
 * 测试volatile关键字不保证操作的原子性
 */
public class TestJava {
    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) throws InterruptedException {


        final TestJava test = new TestJava();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        }

        //保证其他线程已经执行完毕
        Thread.sleep(10000);
        System.out.println(test.inc);
    }
}
