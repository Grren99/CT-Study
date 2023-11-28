package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;

public class N1735 {
    /**
     * 분수 A/B는 분자가 A, 분모가 B인 분수를 의미한다. A와 B는 모두 자연수라고 하자.
     * 두 분수의 합 또한 분수로 표현할 수 있다.
     * 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오. 기약분수란 더 이상 약분되지 않는 분수를 의미한다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // 두 분수의 합을 구해 주는 방식
        A = A * D + B * C;
        B = B * D;
        int answer = GCD(A, B);
        System.out.println(A / answer + " " + B / answer);
    }
    // 유클리드 호제법 다른 사용 예시 (기약분수)
    public static int GCD(int a , int b){

        if(a % b == 0) return b;

        return GCD(b , a%b);
    }
}

