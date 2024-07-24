package j18_제네릭;

public class ProductController {
    /*
        1. Product 클래스를 정의하고, 제네릭 타입 T를 사용하여 상품 정보를 저장할 수 있도록 하세요.
        2. ProductController 클래스를 만들어 다양한 타입의 상품 정보를 저장하고 출력하는 코드를 작성하세요.
        3. 각 상품에 대해 이름과 정보를 저장하고 출력하세요.

        실행 예시

        Product(productName=Laptop, productInfo=intel i7, 16GB RAM, 512GB SSD)
        Product(productName=Smartphone, productInfo = 799.99)
        Product(productName=Available, productInfo=true)
     */

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product<String>("Laptop", new String("intel i7, 16GB RAM, 512GB SSD"));
        products[1] = new Product<Double>("Smartphone", 799.99);
        products[2] = new Product<Boolean>("Available", true);

        for(Product product : products){
            System.out.println(product);
        }
    }
}
