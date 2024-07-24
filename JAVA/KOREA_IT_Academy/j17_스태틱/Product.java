package j17_스태틱;

import lombok.Data;

@Data // Lombok을 이용하여 getter, setter, toString 메소드를 자동 생성
public class Product {
    public static int autoIncrement = 20240000; // static 변수는 모든 객체가 공유

    private int serialNumber;
    private String productName; // 멤버 변수 -> 객체마다 다른 값을 지니게 됨

    // 생성자에서 autoIncrement 값을 사용하여 serialNumber 값을 초기화
    public Product(String productName){
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }

    // static 메서드는 클래스 차원에서 호출할 수 있음
    public static int getAutoIncrement(){
        return autoIncrement;
    }

    //
    public static void printInfo(){
//        System.out.println(productName); // 멤버 변수는 static 메소드에서 사용할 수 없음
        Product product = new Product("product");
        System.out.println(product.productName);
        System.out.println(autoIncrement);
    }
}
