package JAVA.junGi.pro.level0;

public class Question29 {

        // 치킨 쿠폰
        public int solution(int chicken) {
            int answer = 0;

            while (chicken >= 10) {
                int newChicken = chicken / 10;
                int restChicken = chicken % 10;
                chicken = newChicken + restChicken;

                answer += newChicken;
            }

            return answer;
    }

}
