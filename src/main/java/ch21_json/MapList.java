import java.util.*;

public class MapList {
    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();

        // 예시 고객 정보 추가
        Map<String, Object> customer1 = new HashMap<>();
        customer1.put("name", "홍길동");
        customer1.put("age", 30);
        customer1.put("email", "hong@example.com");

        Map<String, Object> customer2 = new HashMap<>();
        customer2.put("name", "김철수");
        customer2.put("age", 25);
        customer2.put("email", "kim@example.com");

        customers.add(customer1);
        customers.add(customer2);

        // 출력
        for (Map<String, Object> customer : customers) {
            System.out.println("이름: " + customer.get("name"));
            System.out.println("나이: " + customer.get("age"));
            System.out.println("이메일: " + customer.get("email"));
            System.out.println("------------");
        }
    }
}
