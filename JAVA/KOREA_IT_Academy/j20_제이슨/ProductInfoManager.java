package j20_제이슨;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

/*
    지시사항
    1. 제품 정보를 담은 Map을 생성하고, JSON문자열로 변환합니다.
    2. JSON 문자열을 다시 Map으로 변환합니다.
 */
public class ProductInfoManager {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        // 제품 정보를 담은 Map productCode - MVX23KG/A / productName - 아이패드프로7세대13인치 / price - 1999000
        Map<String, Object> productMap = new HashMap<>();
        productMap.put("productCode", "MVX23KG/A");
        productMap.put("productName", "아이패드프로 7세대 13인치");
        productMap.put("price", "1999000");


        // Map을 Json 문자열로 변환
        String mapJson = gson.toJson(productMap);
        System.out.println(mapJson);

        // Json문자열을 Map으로 변환
        Map<String, Object> productMap2 = convertJsonToMap(mapJson);
        System.out.println(productMap2);
    }

    public static Map convertJsonToMap(String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(json, Map.class);
    }
}
