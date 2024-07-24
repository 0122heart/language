package j20_제이슨;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
    도서 정보 관리 시스템

    도서의 제목, 저자, 출판년도 및 가격 정보를 addProperty를 사용해서 생성하고, 이를 JSON 문자열로 변환해서 출력

    도서 제목 = title
    저자 = author
    출판 년도 = publishYear
    가격 정보 = price int

    JsonObject -> JSON 문자열로 바꿀 때 -> bookJson
    JSON 문자열 -> JsonObject -> convertedBookInfo
 */
public class BookInfoManager {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("title", "인간 실격");
        jsonObject.addProperty("author", "다자이 오사무");
        jsonObject.addProperty("publishYear", "2000");
        jsonObject.addProperty("price", 14000);

        // JsonObject to Json String
        System.out.println(jsonObject);
        String bookJson = null; // 나중에 JSON String을 담을 변수
        bookJson = gson.toJson(jsonObject);
        System.out.println(bookJson);

        // Json String to JsonObject
        JsonObject convertedBookInfo = new JsonObject();
        convertedBookInfo = gson.fromJson(bookJson, JsonObject.class);
        System.out.println(convertedBookInfo);
    }
}
