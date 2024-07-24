package j11_배열;

public class ArrayTest1 {
    /*
        배열의 필요성 :
        여태까지의 수업을 기준으로 하면 10개의 정수형 데이터를 저장하려면 변수를 10개 만들어서 저장해야 했습니다.
        배열은 같은 자료형의 데이터를 하나의 변수에 저장해서 처리하는 방식입니다.

        배열 선언 방식:
        int[] arr = new int[5]; 배열을 선언만 하고 후에 값을 대입하는 방식

        int[] arr = {1, 2, 3, 4, 5};  배열 선언과 동시에 초기화를 하는 방식

        System.out.println(arr);

        출력해보면 [I@3b6eb2ec 이런 값이 출력되고 {1, 2, 3, 4, 5}가 나오지 않음을 확인할 수 있습니다.
        여기서 일반 변수와 참조 변수 개념에 대해서 확인할 수 있습니다.

        일반 변수 : 데이터를 직접 가지는 변수
                byte, short, int, double 등 기본 데이터 타입을 가지는 경우
        참조 변수 : 데이터가 위치한 주소값을 가지는 변수로 해당 주소를 통해서 데이터에 접근하여 값을 가져오거나 변경합니다.
                String, 배열, Collections, 객체(class)
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  // 배열 선언과 동시에 초기화

        System.out.println(arr);  // 출력해보면 주소값만 나온다

        int[] arr2 = new int[3];  // 배열 선언만 하고 후에 값을 대입한 예
        arr2[0] = 3;
        arr2[1] = 2;
        arr2[2] = 1; // arr2 = {3, 2, 1}

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[4]);
        System.out.println(arr[3]);

        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }

        int[] numArray = new int[10];

        int index = 9;

        numArray[index] = 10;

        for(int i = 0; i < 10; i++){
            System.out.println(numArray[i]);
        }
    }
}
