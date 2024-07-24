package j09_클래스;

public class ProductMain {
    public static void main(String[] args) {

        // 기본 생성자로 생성
        Product p = new Product();
        p.showInfo();
        System.out.println();

        // int 매개변수를 가지는 생성자로 생성
        Product p2 = new Product(12345678);
        p2.showInfo();
        System.out.println();

        // String 매개변수를 가지는 생성자로 생성
        Product p3 = new Product("자바개발자");
        p3.showInfo();
        System.out.println();

        // int, String 매개변수를 가지는 생성자로 생성
        Product p4 = new Product(10, "C언어 개발자");
        p4.showInfo();
        System.out.println();
    }
}
