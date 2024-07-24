package j15_Object클래스;

import j16_Bean.UserEntity;

import java.util.Objects;

public class Student {

    /*
        1. Student 클래스에 학생의 이름(name)과, 학번(studentId)를 저장하는 필드를 작성하세요.
        2. equals(), hashCode()메소드를 재정의하여 학생 객체들이 같은지 여부를 이름과 학번으로 비교하도록 만들어보세요.

        지시 사항.
        1. Student 클래스는 name과 studentId를 private 필드로 가지고 있어야 함.
        2. equals() 메소드를 오버라이딩하여, 두 학생 객체가 이름과 학번이 모두 같으면 true를 반환핟도록 구현해야함.
        3. hashCode() 메소드를 오버라이딩하여, 이름과 학번을 기반으로 한 해쉬코드를 반환하도록 구현해야 함.

        Student 클래스를 활용하여, 학생 객체를 생성하고 toString() 메소드를 이용해 학생의 이름과 학번을 포함한 정보를 출력하는 예제를 잘성하시오
     */

    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(name, student.name) && Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, studentId);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString(){
        return "Student [name=" + name + ", studentId=" + studentId + "]";
    }
}
