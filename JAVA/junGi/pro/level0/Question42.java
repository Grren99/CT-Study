package JAVA.junGi.pro.level0;
import java.util.Arrays;

public class Question42 {
    // 2차원 배열 만들기
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length / n][n];
            int count = 0;
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer[i].length; j++, count++) {
                    answer[i][j] = num_list[count];
                }
            }
            return answer;
    }
}
