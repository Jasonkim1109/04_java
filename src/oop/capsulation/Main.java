package oop.capsulation;

/**
 * 접근 제어자	같은 클래스의 멤버	같은 패키지의 멤버	자식 클래스의 멤버	그 외의 영역
 * public             	○	          ○	            ○	           ○
 * protected	        ○	          ○	            ○	           X
 * default	            ○	          ○          	X	           X
 * private	            ○	          X         	X              X
 */
public class Main {
    public static void main(String[] args) {
        MyPublic myPublic = new MyPublic();
        MyPublic.pprint(); // 클래스 메서드
        System.out.println(MyPublic.hello); // 클래스 변수
        myPublic.print(); // 인스턴스 메서드
        System.out.println(myPublic.msg); // 인스턴스 변수
    }
}
