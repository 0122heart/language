package j17_스태틱;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {
    private String name;  // ProductMain 클래스의 멤버 변수
                          // Lombok 어노테이션을 통해 getter, setter 생성

    public static void main(String[] args) {
        // static 메서드 호출 예시
        int autoIncrement = Product.getAutoIncrement();
        System.out.println(autoIncrement);  // 20240000
        System.out.println(Product.autoIncrement);  // 20240000
        Product.autoIncrement++;  // 20240001
        System.out.println(Product.getAutoIncrement());  // 20240001

        Product p1 = new Product("p1");
        System.out.println(Product.getAutoIncrement());  // 20240002
        Product p2 = new Product("p2");
        Product p3 = new Product("p3");
        Product p4 = new Product("p4");
        Product p5 = new Product("p5");
        System.out.println(Product.getAutoIncrement());
        System.out.println(Product.getAutoIncrement());
        System.out.println(Product.getAutoIncrement());
        System.out.println(Product.getAutoIncrement());
        System.out.println(Product.getAutoIncrement());

        // 상수값 사용 예시
        System.out.println(PathRepository.PRODUCT_IMG_PATH);
        System.out.println(PathRepository.PROFILE_IMG_PATH);
        System.out.println(PathRepository.MAIN_IMG_PATH);

        // Lombok 어노테이션을 통한 getter, setter 예시
        ProductMain productMain = new ProductMain();
        productMain.setName("test");
        System.out.println(productMain.getName());
    }
}
