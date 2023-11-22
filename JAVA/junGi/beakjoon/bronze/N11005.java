package JAVA.junGi.beakjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N11005 {
    /**
     * 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
     * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
     * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        List<Character> list = new ArrayList<>();

        while (N > 0){
            int value = N % B;

            if(value < 10){ // 10보다 작다면
                list.add((char) (value + '0')); // 숫자를 리스트에 추가
            }else{
                list.add((char) (value - 10 + 'A')); // 10 이상이면 알파뱃을 리스트에 추가
            }

            N = N / B; // 나눈 값 구하기

        }
        // 오른쪽부터 출력
        for(int i = list.size() - 1 ; i >= 0; i--){
            System.out.print(list.get(i));
        }
    }
}
