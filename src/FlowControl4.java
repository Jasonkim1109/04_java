import java.util.ArrayList;
import java.util.Arrays;

public class FlowControl4 {

    public static void main(String[] args) {
        // for 와 while
        // 반복의 회수가 정해진 경우
        // for (초기값; 조건식; 증감식) {
        //             조건을 만족할 때까지 실행될 실행문
        // }
        // 같은 동작을 만들기 위해 최대한 짧은 코드
        // 덜 반복하는 코드가 좋은 코드.
        // 주석이 필요없을 정도로 변수명 등이 깔끔한 코드

        // 1~10까지 짝수만 출력하는 for 문 while문
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("=================2====================");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // 반복의 회수가 정해져있지 않은 경우
        // 초기값
        // while (조건식) { 실행문 }
        // 1~10까지 짝수만 출력하는 while문
        System.out.println("==================while==================");
        int i = 2;

        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }

        // Array / ArrayList / Map 의 반복문

        // 3. 배열(Array): 같은 자료형의 값을 고정된 크기로 저장
        System.out.println("[Array]"); // + 먹고싶다
        String[] cheese = {
                "cheddar", "gouda", "edam", "provolone", "parmesan"
        };

        System.out.println(cheese.length); // array의 길이(원소의 개수)

        // for (초기값; 조건식; 증감식) {   }
        // 조건에 의해 일부 방번호에만 해당하는 작업을 수행 가능
        for (int cnt = 0; cnt < cheese.length; cnt++) {
            if (cnt % 2 == 0) {
                System.out.println(cheese[cnt] + " 먹고 싶다");
            }
        }

        System.out.println("======= for each 문 ===========");
        // for ~ each 문     for (자료형 단수공갈문자: 집합자료명) { 실행문 }
        // 방 번호를 경유하지 않고 값 자체로 사용하기 때문에 일괄적인 작업에 주로 사용
        for (String item: cheese) {
            System.out.println(item + "먹고 싶다");
        }

        // 4. ArrayList: 크기를 변경할 수 있는 방번호로 접근하는 자료형
        System.out.println("[ArrayList]");
        ArrayList<String> cheeseList = new ArrayList<>(Arrays.asList( "cheddar", "gouda", "edam", "provolone", "parmesan"));
        System.out.println(cheeseList);
        System.out.println(cheeseList.size()); // arrayList의 길이(원소의 개수)

        // for문, for each문을 활용해서 `~ 먹고 싶다` 를 출력해보세요
        // for (초기값; 조건식; 증감식) {   }
        // 조건에 의해 일부 방번호에만 해당하는 작업을 수행 가능
        for (int cnt = 0; cnt < cheeseList.size(); cnt++) {
            if (cnt % 2 == 0) {
                System.out.println(cheeseList.get(cnt) + " 먹고 싶다");
            }
        }


        System.out.println("======= for each 문 ===========");
        // for ~ each 문     for (자료형 단수공갈문자: 집합자료명) { 실행문 }
        // 방 번호를 경유하지 않고 값 자체로 사용하기 때문에 일괄적인 작업에 주로 사용
        for (String item: cheeseList) {
            System.out.println(item + "먹고 싶다");
        }


    }
}
