package j18_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class StudentGrade<T> {
    private String studentName;
    private T grade;
}
