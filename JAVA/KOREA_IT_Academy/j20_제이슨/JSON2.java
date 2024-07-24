package j20_제이슨;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        // Gson이 상위 클래스, GsonBuilder가 하위 클래스
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        // Object(객체) -> JSON형태로 변환
        User user = new User("uijin", "1234", "0122heart@gmail.com", "박의진", "23");
        System.out.println(gson.toJson(user));
        System.out.println(gsonBuilder.toJson(user));
        userJson = gsonBuilder.toJson(user);

        // JsonObject(객체) -> JSON 형태로 변환
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "202255550");
        jsonObject.addProperty("studentName", "박의진");
        jsonObject.addProperty("studentYear", "3");
        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);

        // Map -> JSON형태로 변환
        Map<String, Object> map = new HashMap<>();
        map.put("productCode", "NT960XGK-KH51G");
        map.put("productName", "갤럭시북4 프로");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);

        // JSON -> Map 형태로 변환
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData.get("name"));  // key값으로 조회해서 value인 박의진을 return함

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);  // Map 형태로 출력 {studentCode=202255550, studentName=박의진, studentYear=3} JSON format 아님

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);

        // JSON -> jsonObject로 변환
        JsonObject jsonObj = convertJsonToObject(userJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToObject(studentJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToObject(productJson);
        System.out.println(jsonObj);
    }

    public static Map convertJsonToMap(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Map.class);
    }

    // JSON 문자열을 JsonObject로 변환하는 메소드
    public static JsonObject convertJsonToObject(String json){
        // 여기 메소드 구현하시오
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class);
    }

    // JSON 문자열을 User 객체로 변환하는 메소드
    public static User convertJsonToUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, User.class);

    }
}
