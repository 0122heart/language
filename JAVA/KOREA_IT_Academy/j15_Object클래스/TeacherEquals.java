package j15_Object클래스;

public class TeacherEquals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("바그진", "PNU");
        j15_Object클래스.equals.Teacher teacher2 = new j15_Object클래스.equals.Teacher("바그진", "PNU");

//        System.out.println(teacher1 == teacher2); 객체끼리의 연산에 ==를 쓸 수 없음!!!

        System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher1.hashCode() == teacher2.hashCode());
    }
}
