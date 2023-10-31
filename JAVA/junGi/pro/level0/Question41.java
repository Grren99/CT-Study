package JAVA.junGi.pro.level0;

public class Question41 {

        //배열 회전 시키기
        public int[] solution(int[] numbers, String direction) {
            int len = numbers.length;
            int[] answer = new int[len];

            if (direction.equals("right")) {
                // 배열 요소를 오른쪽으로 한 칸 이동
                for (int i = 0; i < len; i++) {
                    answer[(i + 1) % len] = numbers[i];
                }
            } else if (direction.equals("left")) {
                // 배열 요소를 왼쪽으로 한 칸 이동
                for (int i = 0; i < len; i++) {
                    answer[i] = numbers[(i + 1) % len];
                }
            }

            return answer;
    }

}
