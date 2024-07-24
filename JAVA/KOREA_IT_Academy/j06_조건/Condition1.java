package j06_조건;

public class Condition1 {
    // if문
    // 형식
    // if(조건문){
    //  실행문
    // }
    public static void main(String[] args) {
        int num = -10;

        if(0 < num || num == 0){
            System.out.println("num이 0이거나 num은 양수입니다.");
        }
        else{
            System.out.println("num은 음수입니다.");
        }

        if(num < 0){
            System.out.println("num은 음수입니다.");
        }
    }
}
