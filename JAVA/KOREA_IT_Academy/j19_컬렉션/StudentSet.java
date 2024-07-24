package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20240001, "박의진"));
        students.add(new Student(20240002, "박진"));
        students.add(new Student(20240003, "의진"));
        students.add(new Student(20240004, "박의"));
        students.add(new Student(20240005, "박으진"));

        System.out.println(students);

        int cmpId = 20240000;

        List<Student> sortStudent = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++){
            cmpId++;  // id 오름차순으로 정렬하겠다는 의미 -> set은 순서가 없기 때문에 list를 통해서 정렬해야 함.
            for(Student student : students){
                if(student.getId() == cmpId){
                    sortStudent.add(student);
                }
            }
        }
        System.out.println("---- 정렬된 lsit ----");
        System.out.println(sortStudent);

        /*
            1. xx 학생의 학번을 출력하세요.
            2. yy 학번을 가진 학생을 바구진으로 변경하세요.
            3. zz 학번이 존재한다면 해당 학생을 삭제하세요.

            set -> list 변환시키고
            해당 list를 학번 순서에 맞게 정렬하세요.
         */

        // my code
        System.out.println("---- 과제 ----");
        for(Student student : students) {
            if (student.getName().equals("박진")) {
                System.out.println("박진 학생의 학번은 " + student.getId());
            }
        }

        for(Student student : students) {
            if (student.getId() == 20240003) {
                student.setName("바구진");
            }
        }

        // 그 이후는 생략
        // Iterator에 대해 배워야함..

    }
}
