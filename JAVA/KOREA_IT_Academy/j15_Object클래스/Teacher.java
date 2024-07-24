package j15_Object클래스;

import java.util.Objects;

public class Teacher {

    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    // equals()는 주로 문자열끼리 동일한지를 확인하기 위한 용도로 String 클래스에서 많이 쓰지만 해당 메소드 역시 Object 클래스에서 overriding 받은 것이다.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher teacher = (Teacher) obj;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }


//        my code
//        if(obj instanceof Teacher){
//            Teacher teacher = (Teacher) obj;
//            return this.name.equals(teacher.name) && this.schoolName.equals(teacher.schoolName);
//        }
//        else{
//            return false;
//        }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }

    @Override
    public String toString(){
        return "Teacher{" +
                "name = '" + name + '\'' +
                ", schoolName = '" + schoolName + '\'' +
                '}';
    }
}
