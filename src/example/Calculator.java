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
//extends Number(상속)
public class Calculator<T extends Number> {
    private ArrayList<Double> results = new ArrayList<>();


    //조회
    public ArrayList<Double> getResults(){
        return results;
    }
    //저장
    public void setResults(ArrayList<Double> results){
        this.results = results;
    }
    //첫 번째 값 삭제
    public void removeResults(double result){

        results.remove(0);
    }
    public double calculator(T n1,T n2, OperatorType op) {
      double a= n1.doubleValue();//n1을 double로 변환
      double b= n2.doubleValue();
      double result = 0;

      switch (op) {
          case plus:
              result = a + b;
              break;
          case sub:
              result = a - b;
              break;
          case mul:
              result = a * b;
              break;
          case div:
              if(b == 0){
                  System.out.println("0으로 나눌 수 없습니다.");
              }
              result = a / b;
              break;
      }
        results.add(result);//컬렉션에 result 값 저장
        return result;
    }

}
