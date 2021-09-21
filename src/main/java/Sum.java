import java.text.DecimalFormat;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.####");
        System.out.println("Введите первое число:");
        float a = in.nextFloat();
        System.out.println("Введите второе число:");
        float b = in.nextFloat();
        System.out.println("Введите арифметическую операцию и нажмите ENTER:");
        String c = in.next();

        if(a == 0) {
            switch (c) {
                case "/": System.out.println("Ошибка.На ноль делить нельзя");
                    break;
                case "*": System.out.println(df.format(a * b));
                    break;
                case "+": System.out.println(df.format(a + b));
                    break;
                case "-": System.out.println(df.format(a - b));
                    break;
                default: System.out.println("Введена некорректная арифметическая операция! Начните заново!");
                    break;
            }
        } else {
            switch (c) {
            case "/": System.out.println(df.format(a / b));
                break;
            case "*": System.out.println(df.format(a * b));
                break;
            case "+": System.out.println(df.format(a + b));
                break;
            case "-": System.out.println(df.format(a - b));
                break;
            default: System.out.println("Введена некорректная арифметическая операция! Начните заново!");
                break;
        } }
    }
}
