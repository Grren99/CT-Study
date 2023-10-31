package JAVA.junGi.pro.level0;

public class Question43 {

        // 구술을 나누는 경우의 수
        // 재귀함수를 이용 한 풀이
        public int solution(int balls, int share) {
            return combination(balls, share);
        }

        public static int combination(int balls, int share) {
            if (balls == share || share == 0) return 1;
            return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
        }
}
