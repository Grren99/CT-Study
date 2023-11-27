package JAVA.junGi.beakjoon.sliver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class N1764 {
    /**
     * 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
     * 이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
     * 듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        Map<String, Integer> map = new TreeMap<>(); // 사전순 정렬 TreeMap

        for(int i = 0; i < N + M; i++){
            String value = sc.next();
            map.put(value, map.getOrDefault(value , 0) + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<String , Integer> maps : map.entrySet()) {
            if (maps.getValue() > 1) {
                count++;
                stringBuilder.append(maps.getKey()).append("\n");
            }
        }
        System.out.println(count);
        System.out.println(stringBuilder);
    }
}
