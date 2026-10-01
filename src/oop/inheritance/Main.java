package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.totalStudentNo); // 클래스 변수
        System.out.println(Student.getTotalStudentNo()); // 클래스 메서드

        Student kim = new Student();
        kim.name ="김연지";
        kim.enter();

        System.out.println(kim.name);

        Student shin = new Student();
        shin.name ="신짱구";
        shin.enter();
        System.out.println(shin.name);
    }
}
