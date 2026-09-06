package functional_Interface;

public class Main {
    public static void main(String[] args){
        Employee emp = () -> "Sachin Tiwari";
        System.out.println(emp.getName());
    }
}
