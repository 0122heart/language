package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        // 객체에 List를 넣기 위해서 .add(생성자(매개변수)); 형태로 입력해야함.

        List<Student> students = new ArrayList<>();
        students.add(new Student(20240001, "박의진"));
        students.add(new Student(20240002, "박진"));
        students.add(new Student(20240003, "의진"));
        students.add(new Student(20240004, "박의"));
        students.add(new Student(20240005, "박으진"));

        String searchName = "의진";

        // 향상된 for문으로 list 내부 탐색
        for(Student student : students){
//            if(student.getName() == searchName)  // 이렇게 쓸 수 없다 -> 주소 값이 다르기 때문
            if(student.getName().equals(searchName)){  // 문자열이 같은지 확인하기 위해서는 equals() 메소드 사용
                System.out.println(searchName + " 학생의 학번 " + student.getId());
                break;
            }
        }

        // 일반 for문으로 list 내부 탐색
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getName().equals(searchName)){
                System.out.println(searchName + "학생의 학번 " + student.getId());
                break;
            }
        }

        // 향상된 for문을 통해 id를 통한 이름 조회
        int searchId = 20240003;
        for(Student student : students){
            if(student.getId() == searchId){
                System.out.println(searchId + " 학생의 이름 " + student.getName());
                break;
            }
        }

        // List의 요소 삭제 방법
        System.out.println(students);
        students.remove(0);
        System.out.println(students);

        // 일반 for문을 통해서 searchId에 해당하는 객체 지우기.
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getId() == searchId) {
                students.remove(i);
                break;
            }
        }
        System.out.println(students);

        // setName
        // id = 20240002인 학생을 찾아서 그 학생의 이름이 xx라면 yy로 바꾸는 것
        int searchId2 = 20240002;

        for(Student student : students){
            if(student.getId() == searchId2 && student.getName().equals("박진")){
                student.setName("아브라카타브라");
                break;
            }
        }
        System.out.println(students);


    }
}
