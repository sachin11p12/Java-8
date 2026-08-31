package lambdaFunction;

public class Main {
    public static void main(String[] args) {
        Employee emp = () -> "software engineer !"; // lambda expression
        System.out.println(emp.getName());
        Employee editor = () -> "Editor Hai !";
        System.out.println(editor.getName());
    }
}
