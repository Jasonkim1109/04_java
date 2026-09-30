public class FlowControl1 {
    public static void main(String[] args) {
//        // if ~ else if ~ else 구문
//        // if (조건식) { 실행문
//        // } else if (조건식2) {
//        // 조건식2가 참일 때 실행문
//        // } else {
//        // 거짓인 경우 실행문 }
//        // 서킷 평가(Short-circuit Evaluation, 단락 평가)는
//        // 프로그래밍에서 논리 연산자(AND &&, OR ||)를 처리할 때
//        // 첫 번째 조건만으로 전체 결과가 확실할 경우,
//        // 두 번째 조건의 평가는 건너뛰는 방식입니다.
//        // 조건문에서 다중조건을 사용할 경우 &&, ||
//        System.out.println( "|| 1---- " + (true || check() ));
//        System.out.println( "| 2---- " + (true | check() ));
//
//        System.out.println( "|| 3---- " + (check() || true ));
//        System.out.println( "| 4---- " + (check() | true ));
//
//
//        // and(&, &&), or(|, ||), not(!)
//        if (false || true) {
//            System.out.println("참입니다");
//        } else {
//            System.out.println("거짓입니다");
//        }

        int num = 0;

        // if ~ else ~ if else 양수이면 양수,
        // 0이면 0입니다, 음수이면 음수 라고 문자열을 콘솔에 출력하는 조건문을 만들어주세요.
        if (num > 0) {
            System.out.println("양수입니다");
        } else if (num < 0) {
            System.out.println("음수입니다");
        } else {
            System.out.println("0입니다");
        }

        // switch ~ case 구문
        // switch (판별조건) {
        //    case 케이스1:
        //              실행문;
        //              break;
        //    case 케이스2:
        //              실행문;
        //              break;
        //    default:
        //              나머지 모든 경우의 실행문;
        //              break; // 마지막줄인 경우에는 생략 가능
        // }

        // 삼항연산자    식 ? 참 : 거짓
    }

    // 접근제어자 함수의메모리위치 리턴타입 함수명(입력받을자료형 공갈문자명)
    public static boolean check() {
        System.out.println("check 실행");
        return false;
    }
}
