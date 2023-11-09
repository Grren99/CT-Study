package JAVA.junGi.pro.level1;

public class Question21 {

        // 로또의 최고 순위와 최저 순위
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int count = 0;
            int zeroCount = 0;

            for(int i = 0 ; i < lottos.length; i++){
                if(lottos[i] == 0){
                    zeroCount++;
                }
                for(int j = 0 ; j < win_nums.length; j++){

                    if(lottos[i] == win_nums[j]){
                        count++;
                    }

                }

            }
            answer[0] = getRank(zeroCount + count);
            answer[1] = getRank(count);
            return answer;
        }
        public int getRank(int count){
            switch(count){
                case 6: return 1;
                case 5: return 2;
                case 4: return 3;
                case 3: return 4;
                case 2: return 5;
                default: return 6;
            }
        }
}
