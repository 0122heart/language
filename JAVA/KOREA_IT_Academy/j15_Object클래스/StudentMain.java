package j15_Object클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("박의진", 202255550);

        System.out.println(student.toString());

        student.setName("바그진");
        student.setStudentId(202455550);

        System.out.println(student.toString());

        System.out.println();

        System.out.println(student.getName());
        System.out.println(student.getStudentId());
    }
}
