package JAVA.junGi.pro.level2;

public class Question18 {

    // N개의 최소공배수
    // 유클리드 호제법
    public int solution(int[] arr) {
        int answer = arr[0];

        for(int i = 1; i < arr.length; i++){
            // 두 값의 최대 공약수
            int g = gcd(answer , arr[i]);
            // 두 값의 최소 공배수
            answer *= arr[i] / g;
        }

        return answer;
    }
    public int gcd(int a , int b){
        int max = Math.max(a , b);
        int min = Math.min(a , b);

        while(max % min != 0){
            int value = max % min;
            max = min;
            min = value;
        }
        return min;
    }
}
