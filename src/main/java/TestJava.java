public class TestJava {


    //Java多线程
    public static void main(String[] args) {


        new Thread(){
            @Override
            public void run() {
                super.run();
                for (int i = 0; i <1000 ; i++) {
                    System.out.println("In Thread2");
                }
            }
        }.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("In main Thread");
        }

    }
}

//class TestThread extends Thread {
//
//    @Override
//    public void run() {
//        super.run();
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("In Thread2");
//        }
//    }
//}
