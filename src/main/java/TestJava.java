public class TestJava {

    public static void main(String[] args) {

        Child child = new Child();
        child.doSomething();
    }

}

class Parent{
    private Parent(){

    }

    
}

class Child extends Parent{

    public void doSomething(){
        System.out.println("In Child!");
    }
}
