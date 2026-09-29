import java.util.Arrays;

// 참조 자료형
public class DataType2 {

    public static void main(String[] args) {
        // [ ]: Array 방 크기를 고정해놓고 사용하는 참조자료형
        int a = 1;

        // 1. 선언 및 할당(대입) true, false, true
         int[] arr1 = {1, 2, (int)3.14}; // 실수->정수 형변환은 자동으로 안됨
//        double[] arr1 = {0.1, 3.14, 1}; // 정수->실수 형변환은 자동으로 됨

        // [I@10f87f48
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[2]); // 순서가 0부터 시작, 방 범위를 벗어나면 에러, 음수 인덱싱도 불가

        // 2. 선언 먼저 하고 값은 나중에 대입 String으로 바꾸고 '가위', '나비', '다람쥐'
//        int[] arr2 = new int[3]; // 방 크기만 정하고 Array 만듦
        String[] arr2 = new String[3]; // 방 크기만 정하고 Array 만듦

        // int로 만든 각 방에는 어떤 값이 들어있을까요?
        // int, long은 기본값으로 0이 들어있음. double이나 float은 0.0
        // String으로 만든 Array는 기본값으로 null이 들어있음.
        System.out.println(Arrays.toString(arr2));
        arr2[0] = "가위";
        arr2[1] = "나비";
        arr2[2] = "다람쥐";
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[2]);
    }
}
