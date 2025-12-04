package example;



import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c1, c2 = 0;
        while(true){
            System.out.println("첫 번째 숫자를 입력하세요.");
            c1 = scanner.nextInt();
            if (c1 >= 0){
                break;
            }
            System.out.println("양의 정수만 입력하세요.");

        }
        while(true){
            System.out.println("두 번째 숫자를 입력하세요.");
            c2 = scanner.nextInt();
            if (c2 >= 0){
                break;
            }
            System.out.println("양의 정수만 입력하세요.");

        }
        System.out.println("사칙연산을 입력하세요");
        String ao =  scanner.next();
//        if (ao.equals("+")){
//            System.out.println("연산결과:" +(c1 + c2));
//        }
//        else if (ao.equals("-")){
//            System.out.println("연산결과:" +(c1 - c2));
//        }
//        else if (ao.equals("*") || ao.equals("x") || ao.equals("X")){
//            System.out.println("연산결과:" +(c1 * c2));
//        }
//        else if (ao.equals("/")){
//            System.out.println("연산결과:" +(c1 / c2));
//        }
        switch (ao){
            case "+":
                System.out.println("연산결과:" +(c1 + c2));
                break;
            case "-":
                System.out.println("연산결과:" +(c1 - c2));
                break;
            case "*" , "x", "X":
                System.out.println("연산결과:" +(c1 * c2));
                break;
            case "/":
                if(c2 == 0)
                {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                }
                System.out.println("연산결과:" +(c1 / c2));

                break;
        }

    }


}
