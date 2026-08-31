package lambdaFunction;

public class Main {
    public static void main(String[] args) {
//        Employee emp = () -> "software engineer !"; // lambda expression
//        System.out.println(emp.getName());
//        Employee editor = () -> "EDITOR Hai !";
//        System.out.println(editor.getName());
        Runnable runnable = () -> {
            for (int i = 1; i <=10 ; i++) {
                System.out.println("Hello "+ i);
            }
        };
        Thread childthread = new Thread(runnable);
        childthread.run();
    }
}
