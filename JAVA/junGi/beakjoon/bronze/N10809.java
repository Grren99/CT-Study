package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N10809 {
    /**
     * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를
     * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] count = new int[26];

        for(int i = 0 ; i < count.length; i++){
            count[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // c - 'a' 아스키코드를 통한 알파뱃 인덱스 값 구하기
            if(count[c - 'a'] == -1){ // -1 경우에 초기화
                count[c - 'a'] = i;
            }
        }
        for (int value : count) {
            System.out.print(value + " ");
        }

    }
}
