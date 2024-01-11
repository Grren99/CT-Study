package JAVA.junGi.pro.level2;

public class Question16 {

    // 동적 게획법 // DPS
    // 땅따먹기
    int solution(int[][] land) {
        int answer = 0;

        for(int i = 1; i < land.length; i++) {
            land[i][0] += maxScore(land[i-1][1], land[i-1][2], land[i-1][3]); // 이전 행에서 현재칸을 제외한 칸의 최대값을 더함
            land[i][1] += maxScore(land[i-1][0], land[i-1][2], land[i-1][3]);
            land[i][2] += maxScore(land[i-1][0], land[i-1][1], land[i-1][3]);
            land[i][3] += maxScore(land[i-1][0], land[i-1][1], land[i-1][2]);
        }

        for(int score : land[land.length - 1]){ // 마지막 행의 최대값 탐색
            answer = Math.max(answer, score);
        }

        return answer;
    }

    public int maxScore(int a, int b, int c) {
        int max = 0;

        max = Math.max(Math.max(a, b), c);

        return max;
    }
}
