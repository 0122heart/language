package j09_클래스;

public class Product {
    /*
        새로운 클래스를 작성하고, 여러 가지 생성자를 정의하세요.
        기본 생성자
        매개변수 생성자

        void showInfo(); 정의하기

        ProductMain 만들기

     */

    int productNum;
    String productName;

    // 기본 생성자
    Product(){
        System.out.println("default constructor");
        this.productNum = 1;
        this.productName = "Unknown";  // 기본값을 Unknown으로 초기화 -> 하지 않을 경우 데이터 입력이 없으면 null로 출력됨
    }

    Product(int productNum){
        System.out.println("constructor with args (int)");
        this.productNum = productNum;
        this.productName = "Unknown";
    }

    Product(String productName){
        System.out.println("constructor with args (String)");
        this.productNum = 1;
        this.productName = productName;
    }

    Product(int productNum, String productName){
        System.out.println("constructor with args (int, String)");
        this.productNum = productNum;
        this.productName = productName;
    }

    void showInfo(){
        System.out.println("Product 정보를 가져옵니다.");
        System.out.println("product num = " + productNum);
        System.out.println("product name = " + productName);
    }
}
