package JAVA.junGi.pro.level0;

public class Question15 {

        //1로 만들기
        public int solution(int[] num_list) {
            int answer = 0;

            for(int i = 0; i < num_list.length; i++){
                while(num_list[i] != 1){
                    num_list[i] = num_list[i] % 2 == 0 ? num_list[i] / 2 : (num_list[i] - 1) / 2;
                    answer++;
                }
            }
            return answer;
    }
}
