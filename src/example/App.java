package example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int c1, c2 = 0;
        String bk = "";

        //exit입력시 루프 탈출
        while(!bk.equals("exit")) {
            //0보다 클때 입력
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


            System.out.println("총 결과"+ cal.getResults());
            System.out.println("인덱스 삭제를 원하면 del");
            String del = scanner.next();
            if(del.equals("del")) {
                cal.removeResults(result); //인덱스 삭제
                System.out.println("삭제 결과"+ cal.getResults());
            }
            System.out.println("종료하려면 exit를 입력하세요.");
            bk =  scanner.next();
        }

    }
}