package JAVA.junGi.pro.level2;

public class Question15 {
    //다음 큰 숫자
    public int solution(int n) {

        int answer = 0;
        // 1. 입력된 n을 2진수로 변환
        String str = Integer.toBinaryString(n);
        int cnt = 0;
        // 2. n에 비트가 1인 개수를 카운팅
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1') cnt++;
        }
        // 3. n+1 부터 1, 2를 반복해 갯수가 일치 하는 수 찾기
        for(int i = n+1; i < 1000000; i++){

            String temp = Integer.toBinaryString(i);
            int temp_cnt = 0;
            for(int j = 0; j < temp.length(); j++){
                if(temp.charAt(j) == '1') temp_cnt++;
            }
            if(cnt == temp_cnt){
                answer = i;
                break;
            }
        }

        return answer;
    }
}
