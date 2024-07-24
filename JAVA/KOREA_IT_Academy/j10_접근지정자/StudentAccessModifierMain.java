package j10_접근지정자;

public class StudentAccessModifierMain {
    public static void main(String[] args) {
        StudentAccessModifier sam = new StudentAccessModifier(20240708, "Unknown");
        sam.setCode(202255550);
        sam.setName("박의진");
        System.out.println(sam.getCode());
        System.out.println(sam.getName());

        sam.showInfo();
    }
}
