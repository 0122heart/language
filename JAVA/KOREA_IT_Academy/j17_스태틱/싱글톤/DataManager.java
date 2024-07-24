package j17_스태틱.싱글톤;

public class DataManager {
    public void performDatabaseOperations(){
        // 싱글톤 인스턴스를 가져와서 데이터베이스 작업을 수행합니다.
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        System.out.println("데이터베이스 연산을 수행 중");
        // 데이터 베이스 작업 후 연결을 닫습니다.
        databaseConnection.closeConnection();
    }
}
