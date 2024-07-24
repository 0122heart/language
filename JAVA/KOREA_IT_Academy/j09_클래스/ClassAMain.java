package j09_클래스;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a1 = new ClassA();
        a1.name = "박의진";
        ClassA a2 = new ClassA();
        a2.name = "박으진";
        a1.callName();
        a2.callName();
//        Scanner scanner = new Scanner(System.in);

//        System.out.print("이름을 입력하세요 >>> ");

//        System.out.print("나이를 입력하세요 >>> ");
//        a2.num = scanner.nextInt();

//        System.out.println(a1.num);
//        System.out.println(a2.num);

//        System.out.print("너도 이름 입력하세요 >>> ");
//        scanner.nextLine();
//        System.out.println(a1.name);
//        System.out.println(a2.name);

    }
}
