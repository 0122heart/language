package j20_제이슨;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    /*
        JSON(JavaScript Object Notation; 자바스크립트로 이루어진 객체 표기법) - 본래 자바스크립트 언어로부터 파생되어 자바스크립트의 구문을 따르지만,
        언어 독립형 데이터 포멧(어떤 언어든 관계 없이 활용 됨)

        프로그래밍 언어나 플랫폼에 독립적이기 때문에 구문 분석 및 JSON 데이터 생성을 위한 코드는 자바, 파이썬 등 다양한 언어에서 쉽게 이용 가능

        {
            "이름공간(key)" : "값(value)",
            "값 구분자" : "각각의 이름은 ','(콤마)로 구분되어야 합니다.",
            "이스케이프" : "키가 값에서 큰 따옴표를 쓰고 싶으면 - 특정 문자를 이스케이프 하려면 - \" 처럼 문자 앞에 역슬래시를 붙입니다.",
            "자료형" : "표현 가능한 자료형은 String, int, double, boolean, null, object, array 6개 입니다.",
            "문자열 값" : "대괄호로 감싸서 표현됨 - 자바와 같음.",
            "숫자" : 123456, // 대괄호 없이 표현됨
            "boolean 값" : true,
            "null 값" : null,
            "object 값" : {
                "값1" : 123456789,
                "값2" : false
                "값3" : {
                    "객체 내부" : "객체 위치 가능",
                    "구분자" : "key-value 구분은 ':'(콜론)으로 이루어집니다."
                }
            },
            "Array 값" : [
                "여기에 String을 넣고 싶다면 다시 ""을 써야합니다.",
                {
                    "현재 값의 인덱스" : 1,
                    "해당 방식처럼" : "배열 안에 여러 값을 넣는 것도 가능"
                },
                ["배열", "내부에", "배열을", "삽입하는 것도", "가능합니다."]
            ],
            "JSON 예시" : "마무리"
        }

        GSON : Google JSON의 약칭 -> 자바에서 생성한 객체를 매개변수로 넣으면 GSON 객체를 생성해 tojson()메소드를 사용,
        Map으로 매칭시킨 데이터들을 JSON String으로 변환해줍니다. 즉 JSON 포맷으로 일일이 작성해야 하는 번거로움을 줄여준다.
     */
    public static void main(String[] args) {
        // JsonObject를 생성하고 속성(키-값 쌍)을 추가(addProperty()메소드 이용해서)
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "uijin");
        jsonObject.addProperty("password", "1234");
        jsonObject.addProperty("email", "0122heart@naver.com");
        jsonObject.addProperty("name", "박의진");
        jsonObject.addProperty("age", "23");

        // JsonObject를 직접 compact 형태로 출력
        System.out.println(jsonObject);

        // prettyPrinting이 활성화된 Gson 인스턴스 생성
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // 들여쓰기로 형식을 맞춘 JSON 문자열을 생성하는 Gson 인스턴스를 생성

        // JsonObject를 prettyPrinting된 JSON 문자열로 변환
        String json = gson.toJson(jsonObject);
        System.out.println(json);

        /*
            Gson 라이브러리 :
                목적 : Gson 라이브러리는 Java 객체를 JSON 형태로 변환하거나, 그 반대로 변환하는 데 사용.
                주요 클래스 :
                    Gson : 변환을 위해 사용되는 주요 클래스
                    GsonBuilder : Gson 인스턴스에 대한 사용자 정의 구성을 허용
                    JsonObject : JSON 객체를 나타냄
         */
    }
}
