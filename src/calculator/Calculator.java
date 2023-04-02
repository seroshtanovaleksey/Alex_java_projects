package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double[] results = new double[2];
        Integer l = 0;
        Scanner reader = new Scanner(System.in);

        for (; ; ) {

            System.out.print("Введите 2 числа: ");

            double first = reader.nextDouble();
            double second = reader.nextDouble();

            System.out.print("Введите оператор: (+, -, *, /): ");
            char operator = reader.next().charAt(0);

            double result = 0.0;

            switch (operator) {
                case '+':
                    result = first + second;
                    break;

                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    result = first / second;
                    break;
                default:
                    System.out.printf("Введите корректный оператор");
                    return;
            }

            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);


            for (int i = 0; i < results.length; i++){
                if (results[i] == 0.0) {
                    results[i] = result;
                    l = l+1;
                    break;
                }
            }

            if (l==results.length) {
                System.out.println("\nМассив результатов заполнен.");
                break;
            }

            System.out.println("\nПродолжить вычисления?");

            String s = reader.next();
            if (s.equals("выход")) {
                break;
            }


        }

    }


}
