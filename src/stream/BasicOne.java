package stream;

public class BasicOne {
    public static void main(String[] args) {

        // imperative approach || traditional
        int[] array = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                sum += array[i];
            }
        }
        System.out.println(sum);
        // declarative approach || stream
        int[] array2 = {1,2,3,4,5,6};

    }
}
