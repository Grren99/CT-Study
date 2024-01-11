package JAVA.junGi.pro.level1;
import java.util.*;

public class Question12 {
    // 포켓몬
    // 중복제거 Set 컬렉션 사용
    class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            int count = nums.length / 2;

            Set<Integer> result = new LinkedHashSet<>();

            for(int i = 0; i < nums.length; i++){

                result.add(nums[i]);

            }
            answer = result.size() >= count ? count : result.size();
            return answer;
        }
    }

}
