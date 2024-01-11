package JAVA.junGi.pro.level2;
import java.util.*;

public class Question14 {
    // 해시
    public int solution(String[][] clothes) {
        int answer = 1;
        // 옷 종류 별로 갯수 구하기 중복시 + 1
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            String  type = clothes[i][1];
            map.put(type , map.getOrDefault(type, 1) + 1);
        }

        // key를 통하여 value값 가져오기
        for(String key : map.keySet()){
            answer *= map.get(key);
        }


        return answer - 1;
    }
}
