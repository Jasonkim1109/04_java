package oop.capsulation;

import oop.abstraction2.MyProtectd;
import oop.abstraction2.MyPublic;

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

        System.out.println("자식클래스==========================");
        MyMyPublic myPublic2 = new MyMyPublic();
        MyMyPublic.pprint(); // 클래스 메서드
        // System.out.println(MyMyPublic.hello); // 클래스 변수
         myPublic2.print(); // 인스턴스 메서드
        // System.out.println(myPublic2.msg); // 인스턴스 변수

        System.out.println("myProtected =================== ");
        MyProtectd myProtectd = new MyProtectd();
        MyProtectd.pprint(); // 클래스 메서드
       //  System.out.println(myProtectd.hello); // 클래스 변수
         myProtectd.print(); // 인스턴스 메서드
       //  System.out.println(myProtectd.msg); // 인스턴스 변수
    }
}
