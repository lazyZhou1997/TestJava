public class TestJava {

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.test(1));

    }

}

class Test {

    public int test(int x) {
        try {
            return ++x;
        } finally {
            return 5;
        }
    }
}