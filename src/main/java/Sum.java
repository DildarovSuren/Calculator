import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        /**
         * Реализуем программу-калькулятор с простыми арифметичекими операциями
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Программа Калькулятор запущена");
        System.out.println("Введите первое число: ");
        double first = in.nextDouble();
        System.out.println("Введите действие: ");
        String action = in.next();
        System.out.println("Введите второе число: ");
        double second = in.nextInt();

        switch (action) {
            case "/":
                calcSlash(first, second);
                break;
            case "*":
                calcX(first, second);
                break;
            case "+":
                calcSum(first, second);
                break;
            case "-":
                calcDel(first, second);
                break;
            default:
                System.out.println("Введена некорректная арифметическая операция! Начните заново!");
                break;
        }
    }

    public static void calcSum(double first, double second) { // Сложение
        System.out.printf("%.4f", (first + second));
    }

    public static void calcDel(double first, double second) { // Вычитание
        System.out.printf("%.4f", (first - second));
    }

    public static void calcX(double first, double second) { // Умножение
        System.out.printf("%.4f", (first * second));
    }

    public static void calcSlash(double first, double second) { // Деление
        if (second == 0) {
            System.out.println("Ошибка. На ноль делить нельзя");
        } else {
            System.out.printf("%.4f", (first / second));
        }
    }
}