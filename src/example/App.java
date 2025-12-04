package example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int c1, c2 = 0;
        String bk = "";

        while(!bk.equals("exit")) {
            while (true) {
                System.out.println("첫 번째 숫자를 입력하세요.");
                c1 = scanner.nextInt();
                if (c1 >= 0) {
                    break;
                }
                System.out.println("양의 정수만 입력하세요.");

            }
            while (true) {
                System.out.println("두 번째 숫자를 입력하세요.");
                c2 = scanner.nextInt();
                if (c2 >= 0) {
                    break;
                }
                System.out.println("양의 정수만 입력하세요.");

            }
            System.out.println("사칙연산을 입력하세요");
            char op = scanner.next().charAt(0);
            int result = cal.calculator(c1, c2, op);
            System.out.println("연산결과:" + result);

            System.out.println("종료하려면 exit를 입력하세요.");
            bk =  scanner.next();
        }

    }
}