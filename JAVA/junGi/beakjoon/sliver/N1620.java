package JAVA.junGi.beakjoon.sliver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class N1620 {
    /**
     * 포켓몬스터
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<String, String> map = new HashMap<>();

        for(int i = 1; i <= N; i++){
            String value = sc.next();
            map.put(value, String.valueOf(i));
            map.put(String.valueOf(i), value);
        }
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < M; i++){
            String value = sc.next();
            stringBuilder.append(map.get(value)).append("\n");
        }
        System.out.println(stringBuilder);

    }
}
