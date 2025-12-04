package example;
import java.util.ArrayList;


public class Calculator {

    ArrayList<Integer> results = new ArrayList<>();

    public int calculator(int n1,int n2, char op) {
      int result = 0;

      switch (op) {
          case '+':
              result = n1 + n2;
              break;
          case '-':
              result = n1 - n2;
              break;
          case '*':
              result = n1 * n2;
              break;
          case '/':
              if(n2 == 0){
                  System.out.println("0으로 나눌 수 없습니다.");
              }
              result = n1 / n2;
              break;
          default:
              System.out.println("지원하지 않는 연산자");
      }
        results.add(result);
        return result;
    }

}
