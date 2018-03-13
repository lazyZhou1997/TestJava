import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestJava {



    private static int i = 0;

    //Java多线程

    /**
     * 调用 sleep 不会释放对象锁。调用 wait 方法导致本线程放弃对象锁，notify并不释放锁
     * @param args
     */
    public static void main(String[] args) {

        new Thread(new Thread1()).start();

        try {
            //确保Thread1执行到wait()
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Thread2()).start();

    }


    private static class Thread1 implements Runnable{
        @Override
        public void run() {

            synchronized (TestJava.class){
                System.out.println("enter thread1");

                System.out.println("thread1 is waiting");

                try {
                    //释放锁有两种方式，第一种方式是程序自然离开监视器的范围，也就是离开了
                    //synchronized关键字管辖的代码范围，另一种方式就是在synchronized关键字管辖的代码 内部调用监视器对象的wait方法。这里，使用wait方法释放锁
                    TestJava.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread1 is going on.");

                System.out.println("Thread1 is being over.");
            }
        }
    }

    private static class Thread2 implements Runnable{
        @Override
        public void run() {

            synchronized (TestJava.class){
                System.out.println("enter Thread2.");

                System.out.println("thread2 notify other thread can release wait status..");

                //由于notify方法并不释放锁， 即使thread2调用下面的sleep方法休息了10毫秒，
                // 但 thread1仍然不会执行，因为thread2没有释放锁，所以Thread1无法得不到锁。
                TestJava.class.notify();

                try {
                    Thread.sleep(10);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("thread2 is going on...");
                System.out.println("thread2 is being over!");
            }
        }
    }

}


