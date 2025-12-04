package example;
import java.util.ArrayList;


public class Calculator {

    private ArrayList<Integer> results = new ArrayList<>();//컬렉션 타입 선언

    public ArrayList<Integer> getResults(){
        return results;
    }
    public void setResults(ArrayList<Integer> results){
        this.results = results;
    }
    public void removeResults(int result){

        results.remove(0);
    }
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
              System.out.println("지원하지 않는 연산자");//case이외의 문자 입력시
      }
        results.add(result);//컬렉션에 result 값 저장
        return result;
    }

}
