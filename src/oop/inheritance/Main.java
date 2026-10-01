package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.totalStudentNo); // 클래스 변수
        System.out.println(Student.getTotalStudentNo()); // 클래스 메서드

        // 자료형 방이름 = 새로방을파서 생성자();
        // 생성자: 인스턴스가 최초로 생성될 때 딱 한번만 실행되는 함수
        String a = new String();
        Student kim = new Student();
        kim.name ="김연지";
        kim.enter();
        System.out.println(kim.name);

        Student lee = new Student("이영희","C반");
        lee.enter();

        AStudent shin = new AStudent();
        shin.name ="신짱구";
        shin.enter();
        shin.enter("11시");
        System.out.println(shin.name);
        System.out.println(AStudent.totalStudentNo); // 클래스변수 오버라이드
        System.out.println(AStudent.getTotalStudentNo()); // 클래스메서드 오버라이드
    }
}
