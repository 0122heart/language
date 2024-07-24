package j17_스태틱.싱글톤;

public class DatabaseConnection{
    // 유일한 인스턴스를 저장하기 위한 정적 변수
    private static DatabaseConnection instance = null;

    // 생성자를 private로 선언하여 외부에서 직접 인스턴스를 생성할 수 없도록 함
    private DatabaseConnection(){
        // 결과적으로 하나의 instance만 생성되기 때문에 이 메시지는 한 번만 출력됨
        System.out.println("데이터베이스를 연결하였습니다.");
    }

    // 유일한 인스턴스를 반환하는 정적 메소드
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void closeConnection(){
        System.out.println("데이터 베이스 연결을 끊었습니다");
    }
}
