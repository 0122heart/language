package j07_반복;

public class loop10 {
    public static void main(String[] args) {
        /*
                *
               **
              ***
             ****
            *****
         */

        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = n; i < j - 1; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = n; i < k; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
