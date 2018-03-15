package edu.scu;


import java.io.*;

/**
 * 学习Java序列化与反序列化方法
 */
public class TestJava {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Jony";
        employee.address = "beijing";
        employee.SSN = 415276187;
        employee.number = 10;

        //进行序列化
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./test.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();

            //结果：�� sr edu.scu.EmployeeMu�]�� I numberL addresst Ljava/lang/String;L nameq ~ xp   
            //t beijingt Jony

        } catch (IOException e) {
            e.printStackTrace();
        }

        //进行反序列化
        employee = null;
        try {
            FileInputStream inputStream = new FileInputStream("./test.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            employee = (Employee) objectInputStream.readObject();

            System.out.println(employee.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;//屏蔽续流花了
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }
}
