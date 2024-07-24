package j15_Object클래스.equals;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
