package JAVA.junGi.beakjoon.sliver;

import java.util.*;

public class N7785 {
    /**
     * 첫째 줄에 로그에 기록된 출입 기록의 수 n이 주어진다. (2 ≤ n ≤ 106) 다음 n개의 줄에는 출입 기록이 순서대로 주어지며,
     * 각 사람의 이름이 주어지고 "enter"나 "leave"가 주어진다. "enter"인 경우는 출근, "leave"인 경우는 퇴근이다.
     * 회사에는 동명이인이 없으며, 대소문자가 다른 경우에는 다른 이름이다. 사람들의 이름은 알파벳 대소문자로 구성된 5글자 이하의 문자열이다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        Map<String, String> map = new TreeMap<>(Comparator.reverseOrder()); // 역순으로 정렬

        for(int i = 0; i < index; i++){
            String key = sc.next();
            String value = sc.next();
            map.put(key, value);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<String, String> maps : map.entrySet()){

            if (maps.getValue().equals("enter")){
                stringBuilder.append(maps.getKey()).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}
