package j09_클래스;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        c1.showInfo();
//        c1.name = "박의진";
//        c1.num = 23;
//        c1.showInfo();


        Constructor c2 = new Constructor(10);
        c2.showInfo();
//        c2.name = "박의진";
//        c2.showInfo();

        Constructor c3 = new Constructor(10, "박의진");
        c3.showInfo();


    }
}
