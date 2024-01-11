package JAVA.junGi.beakjoon.sliver;

import java.util.Arrays;
import java.util.Scanner;

public class N1427 {
    /**
     * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        String[] sp = String.valueOf(value).split("");
        Arrays.sort(sp);
        StringBuilder stringBuilder = new StringBuilder();
        for(String num : sp){
            stringBuilder.append(num);
        }
        System.out.println(stringBuilder.reverse());
    }
}
