package Test3;

public class Test3 {

    public static void main(String[] args) {
        int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < integers.length; i++) {
            if ((integers[i] % 2) == 0) {
                System.out.println(integers[i]);
            }
        }
    }
}
