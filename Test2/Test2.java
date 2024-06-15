package Test2;

public class Test2 {

    public static void main(String[] args) {
        System.out.print("Введите первую строку: >");
        String a = System.console().readLine();

        System.out.print("Введите вторую строку: >");
        String b = System.console().readLine();

        Comparison(a, b);
    }

    private static void Comparison(String a, String b) {
        if (a == b) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }
    }
}
