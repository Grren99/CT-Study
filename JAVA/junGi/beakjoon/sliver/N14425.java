package JAVA.junGi.beakjoon.sliver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class N14425 {
    /**
     * 총 N개의 문자열로 이루어진 집합 S가 주어진다.
     * 입력으로 주어지는 M개의 문자열 중에서 집합 S에 포함되어 있는 것이 총 몇 개인지 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            String value = sc.next();
            map.put(value, 0);
        }

        for(int i = 0; i < M; i++){
            String value = sc.next();
            if (map.containsKey(value)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
