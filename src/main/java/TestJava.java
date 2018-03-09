public class TestJava {

    public static void main(String[] args) {

        String a = "a";
        switch (a) {
            case "":
                System.out.println("");
                break;
            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            default:
                System.out.println("Other");
                break;
        }
    }
}
