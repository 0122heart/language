package j05_Scanner;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        이름 : 박의진
        나이 : 37
        주소 : 부산대학교 금정구
        번호 :

        사용자의 이름은 박의진이고 나이는 23입니다.
        주소는 부산광역시 금정구이며 연락처는 xxx입니다

        next()와 nextLine()의 차이 :
        1. 입력 단위 : next()는 공백 이전까지의 단어를 읽고, nextLine은 줄바꿈 이전까지의 전체 문자열을 읽음
        2. 작동 방식 : next()는 공백 문자를 기준으로 입력을 분리하고, nextLine은 Enter키를 기준으로 입력을 분리한다
        3. 1, 2로 인한 문제점 : next() 다음에 nextLine()을 혼합하여 쓰게 됐을 때, nextLine()을 호출하기 전에 next()
        를 사용하면, next()를 입력하고 난 후에 친 enter키로 인해 nextLine()이 입력을 무시하고 다음 코드라인으로
        넘어가면서 빈 문자열만 저장할 수 있다.

         */

        String name, address, phone;
        int age;
        System.out.println("이름 : ");
        name = sc.nextLine();

        System.out.println("나이 : ");
        age = sc.nextInt();
        sc.nextLine(); // nextLine()을 쓰기 전에 Enter키가 먹는 것을 방지하기 위한 방패막

        System.out.println("주소 : ");
        address = sc.nextLine();

        System.out.println("번호 : ");
        phone = sc.nextLine();

        System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "입니다.");
        System.out.println("주소는 " + address + "이고 연락처는 " + phone + " 입니다.");
    }
}
