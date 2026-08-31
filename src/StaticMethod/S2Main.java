package StaticMethod;

class Q{
    static int hi(int a, int b){
        return a+b;
    }

}
public class S2Main extends Q {
    public static void main(String[] args) {
        Q obj = new Q();
        System.out.println(Q.hi(2,4));

    }
}
