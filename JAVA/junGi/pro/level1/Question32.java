package JAVA.junGi.pro.level1;

import java.util.HashMap;

public class Question32 {
    /**
     * 1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열배열 keymap과 입력하려는 문자열들이 담긴 문자열 배열 targets가 주어질 때,
     * 각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지 순서대로 배열에 담아 return 하는 solution 함수를 완성해 주세요.
     */
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<keymap.length;i++){

            // 최소 클릭수로 덮어씌우기 위해 문자열 끝부터 시작
            for(int j=0;j<keymap[i].length();j++){

                if (map.containsKey(keymap[i].charAt(j))) {
                    // 최소 클릭 수가 뒤에 나왔을 때 갱신
                    Integer nCurrCnt = map.get(keymap[i].charAt(j));
                    if (nCurrCnt > (j+1)){
                        map.put(keymap[i].charAt(j),j+1);
                    }
                }
                else {
                    map.put(keymap[i].charAt(j),j+1);
                }

            }
        }


        // 모든 targets 단어에 대해 반복
        for(int i=0;i<targets.length;i++){
            int nCnt = 0;
            for(int j=0;j<targets[i].length();j++){
                char alpha = (targets[i].charAt(j));
                Integer nMinClick = map.get(alpha);
                if ( nMinClick != null ) {
                    nCnt += nMinClick;
                }
                else{
                    nCnt = -1;  // i번째 단어는 작성할 수 없음
                    break;
                }
            }
            answer[i] = nCnt;

        }

        return answer;
    }
}
