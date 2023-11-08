package JAVA.junGi.pro.level1;

public class Question13 {
        // 소수 찾기
        // 함수 작성
        public int solution(int n) {
            int answer = 0;

            for(int i = 2; i<= n; i++){

                if(isPrime(i)){
                    answer++;
                }

            }

            return answer;
        }
        public boolean isPrime(int num){

            if(num <= 1){
                return false;
            }

            for(int i = 2; i * i <= num; i++){

                if(num % i == 0){
                    return false;
                }

            }

            return true;
    }
}
