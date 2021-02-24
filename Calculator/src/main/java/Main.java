import org.junit.platform.commons.util.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sum sum = new Sum();
        Subtraction sub = new Subtraction();
        Composition comp = new Composition();
        Division div = new Division();
        System.out.println("Выберите действие:\n" +
                "- Введите 0 для выхода из программы\n" +
                "- Введите любую другую строку, чтобы совершить новую операцию");
        String ind = in.nextLine();
        double a;
        String operation;
        double b;

        while (!ind.equals("0")) {
            System.out.println("Введите первое число, знак операции и второе число");

            String str = in.nextLine();
            String strings[] = str.split(" ");
            if (strings.length == 3) {
                if (strings[0].matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")
                        &&
                        strings[2].matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")) {
                    a = Double.parseDouble(strings[0]);
                    operation = strings[1];
                    b = Double.parseDouble(strings[2]);

                    switch (operation) {
                        case "+":
                            sum.execute(a, b);
                            break;
                        case "-":
                            sub.execute(a, b);
                            break;
                        case "*":
                            comp.execute(a, b);
                            break;
                        case "/":
                            div.execute(a, b);
                            break;
                        default:
                            System.out.println("Некорректный ввод");
                    }
                } else {
                    System.out.println("Некоректный ввод");
                }
            } else {
                System.out.println("Некоректный ввод");
            }


            System.out.println("Выберите действие:\n" +
                    "- Введите 0 для выхода из программы\n" +
                    "- Введите любую другую строку, чтобы совершить новую операцию");

            ind = in.nextLine();


        }
    }
}
