package JAVA.junGi.pro.level0;
import java.util.*;

public class Question20 {

    //배열 만들기 6
    class Solution {
        public int[] solution(int[] arr) {
            List<Integer> stk = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                if (stk.isEmpty() || stk.get(stk.size() - 1) != arr[i]) {
                    stk.add(arr[i]);
                } else {
                    stk.remove(stk.size() - 1);
                }
            }
            if(stk.isEmpty()) stk.add(-1);

            // 리스트를 배열로 변환
            int[] answer = new int[stk.size()];
            for (int i = 0; i < stk.size(); i++) {
                answer[i] = stk.get(i);
            }

            return answer;
        }
    }

}
