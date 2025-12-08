package example;
import java.util.ArrayList;
//연산자 타입만 저장
enum OperatorType{
    plus('+'),
    sub('-'),
    mul('*'),
    div('/');

    private final char operator;//계산기 기능 유지를 위해 final선언

    OperatorType(char operator) {
        this.operator = operator;
    }

    public static OperatorType getOT(char operator) {
        for (OperatorType opt: OperatorType.values()) {//enum매칭 및 리턴
            if (opt.operator == operator) {
                return opt;
            }
        }
        throw new IllegalArgumentException("지원하지 않는 연산자: " + operator);//예외처리
    }
}
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
    public int calculator(int n1,int n2, OperatorType op) {
      int result = 0;


      switch (op) {
          case plus:
              result = n1 + n2;
              break;
          case sub:
              result = n1 - n2;
              break;
          case mul:
              result = n1 * n2;
              break;
          case div:
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
