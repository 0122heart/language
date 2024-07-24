package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("바그진", "PNU");
        Teacher teacher2 = new Teacher("바그진", "PNU");
        j15_Object클래스.equals.Teacher teacher3 = new j15_Object클래스.equals.Teacher("바그진", "PNU");

        Class t_class = teacher1.getClass();

        // 클래스 명만 튀어나옴!
        System.out.println(t_class.getSimpleName());

        // 패키지 명도 튀어나옴!!
        System.out.println(t_class.getName());

        Field[] fields = t_class.getDeclaredFields();
        for(int i = 0; i < fields.length; i++){
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType().getSimpleName());
        }

        Method[] methods = t_class.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i].getReturnType());
        }

        System.out.println(teacher1.getClass() == teacher2.getClass());
        System.out.println(teacher1 instanceof Teacher);
        System.out.println();
//        System.out.println(teacher3 instanceof Teacher);
        System.out.println(teacher1.getClass() == Teacher.class);
        System.out.println(teacher2.getClass() == Teacher.class);
    }
}
