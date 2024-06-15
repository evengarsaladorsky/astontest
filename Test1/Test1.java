package Test1;

public class Test1 {

    public static void main(String[] args) {
        try {
            System.out.print("Введите первое число: >");
            int a = Integer.parseInt(System.console().readLine());

            System.out.print("Введите второе число: >");
            int b = Integer.parseInt(System.console().readLine());

            Comparison(a, b);
            Operations(a, b);
        } catch (NumberFormatException err) {
            System.out.println("Введенные данные должны быть числами");
        }
    }

    private static void Comparison(int a, int b) {
        if (a < b) {
            System.out.println("a < b");
        }

        if (a > b) {
            System.out.println("a > b");
        }

        if (a == b) {
            System.out.println("a = b");
        }
    }

    private static void Operations(int a, int b) {
        int sum = a + b;
        System.out.println("a + b = " + sum);

        int difference = a - b;
        System.out.println("a - b = " + difference);

        if (b == 0) {
            System.out.println("Операция a / b невозможна - b = 0.");
        } else {
            int quotient = a / b;
            System.out.println("a / b = " + quotient);
        }

        int multiplication = a * b;
        System.out.println("a * b = " + multiplication);
    }
}
