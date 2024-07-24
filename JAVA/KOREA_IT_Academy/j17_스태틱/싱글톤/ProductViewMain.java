package j17_스태틱.싱글톤;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView.getInstance().showMainView();
        ProductView.getInstance().showOrderView();
    }
}
