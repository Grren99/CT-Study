package JAVA.junGi.pro.level1;
import java.util.*;

public class Question18 {
    // K번째수
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0, size=commands.length;i<size;i++) {
            int start = commands[i][0]-1; // 어디서부터
            int end = commands[i][1]; // 어디까지 자를지
            int k = commands[i][2]-1; // k번째 수


            // Arrays.copyOfRange는 해당 배열을 start부터 end 직전까지를 복사합니다.
            int[] temp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(temp);
            answer[i] = temp[k];
        }
        return answer;
    }
}
