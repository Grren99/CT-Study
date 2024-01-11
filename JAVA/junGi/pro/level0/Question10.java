package JAVA.junGi.pro.level0;

public class Question10 {

    // 홀수 vs 짝수
    // [1,2,3] 배열 구조
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        for(int i = 0; i < num_list.length; i ++){
            if(i % 2 == 0){
                odd += num_list[i];
            }else{
                even += num_list[i];
            }
        }
        answer = even > odd ? even : odd;
        return answer;
    }
}
