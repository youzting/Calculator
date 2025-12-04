package example;



import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c1, c2 = 0;
        String bk = "";
        //exit를 입력할때 까지 무한 루프
        while(!bk.equals("exit")) {
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
            char op = scanner.next().charAt(0);
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
    //

            switch (op) {
                case '+':
                    System.out.println("연산결과:" + (c1 + c2));
                    break;
                case '-':
                    System.out.println("연산결과:" + (c1 - c2));
                    break;
                case '*', 'x', 'X':
                    System.out.println("연산결과:" + (c1 * c2));
                    break;
                case '/':
                    if (c2 == 0) {
                        System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                    }
                    System.out.println("연산결과:" + (c1 / c2));
                    break;
                    default:
                        System.out.println("지원하지 않는 연산자 입니다.");//case이외의 문자 입력시
            }
            System.out.println("종료하려면 exit를 입력하세요.");
            bk =  scanner.next();
        }
    }


}
