package j17_스태틱.싱글톤;

public class SingletonMain {
    public static void main(String[] args) {
        // 여러 DataManager 인스턴스를 생성하여 데이터 베이스 작업을 수행
        DataManager dataManager1 = new DataManager();
        DataManager dataManager2 = new DataManager();

        // 첫번째 데이터베이스 작업 수행
        dataManager1.performDatabaseOperations();
        dataManager2.performDatabaseOperations();

        /*
            동일한 메소드를 두 번 호출했음에도 불구하고, 다음과 같은 결과값이 산출 :

            데이터베이스를 연결하였습니다.
            데이터베이스 연산을 수행 중
            데이터 베이스 연결을 끊었습니다
            데이터베이스 연산을 수행 중
            데이터 베이스 연결을 끊었습니다

            싱글톤에 대해서 복습.
         */
    }
}
