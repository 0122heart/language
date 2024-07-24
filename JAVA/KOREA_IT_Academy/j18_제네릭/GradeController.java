package j18_제네릭;
/*
    1. 다양한 타입의 성적을 저장하고 출력하는 코드를 작성하세요.
    2. 각 학생에 대해 이름과 성적을 저장하고 출력하세요.

    실행 결과

    StudentGrade(studentName=Alice, grade=95)
    StudentGrade(studentName=Bob, grade=88.5)
    StudentGrade(studentName=Charlie, grade=A+)
 */


import j15_Object클래스.Student;

public class GradeController {
    public static void main(String[] args) {
        StudentGrade[] studentGrades = new StudentGrade[3];
        studentGrades[0] = new StudentGrade<Integer>("Alice", 95);
        studentGrades[1] = new StudentGrade<Double>("Bob", 88.5);
        studentGrades[2] = new StudentGrade<String>("Charlie", "A+");

        for(StudentGrade studentGrade : studentGrades){
            System.out.println(studentGrade);
        }

    }
}
