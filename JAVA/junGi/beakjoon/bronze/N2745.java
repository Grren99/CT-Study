package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N2745 {
    /**
     *B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
     * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
     * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String N = sc.next(); // N 값
        int B = sc.nextInt(); // B진법
        int tmp = 1;
        int answer = 0; // 최종 값

        for(int i = N.length() - 1; i >= 0; i--){ // 뒤에서 부터 처리 -> 오른쪽 부터 왼쪽으로 가중치를 설정하기 위해
            char c = N.charAt(i);

            if('A' <= c && c <= 'Z'){
                answer += (c - 'A' + 10) * tmp; // A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
            }else{
                answer += (c - '0') * tmp; // 숫자일 경우 int로 변환후 진행
            }
            tmp *= B; // 가중치 36 , 1296 ...
        }
        System.out.println(answer);
    }
}
