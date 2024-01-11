package JAVA.junGi.pro.level0;

public class Question37 {

        // 직사각형 넓이 구하기
        public int solution(int[][] dots) {

            // 각 변의 길이는 각 좌표의 가장 큰 값에서 가장 작은 값을 빼서 구할 수 있다.
            // -부호를 가진 좌표가 있을 수 있으므로 Math.abs를 통해 절대값으로 구해준다.
            int w = 0;
            int h = 0;
            int x = dots[0][0];
            int y = dots[0][1];
            for (int i = 1; i < dots.length; i++) {
                if (x != dots[i][0]) w = Math.abs(x - dots[i][0]);
                if (y != dots[i][1]) h = Math.abs(y - dots[i][1]);
            }
            return w * h;
    }
}
