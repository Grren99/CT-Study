package JAVA.junGi.pro.level0;

public class Question7 {
        // 가까운 1 찾기
        public int solution(int[] arr, int idx) {
            int answer = 0;
            for(int i = 0; i < arr.length; i ++){
                if(idx <= i && arr[i] == 1){
                    answer = i;
                    break;
                }else{
                    answer = -1;
                }

            }
            return answer;
        }
}
