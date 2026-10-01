package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.totalStudentNo); // 클래스 변수
        System.out.println(Student.getTotalStudentNo()); // 클래스 메서드

        Student kim = new Student();
        kim.name ="김연지";
        kim.enter();

        System.out.println(kim.name);

        AStudent shin = new AStudent();
        shin.name ="신짱구";
        shin.enter();
        shin.enter("11시");
        System.out.println(shin.name);
        System.out.println(AStudent.totalStudentNo); // 클래스변수 오버라이드
        System.out.println(AStudent.getTotalStudentNo()); // 클래스메서드 오버라이드
    }
}
