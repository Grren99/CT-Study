package JAVA.junGi.beakjoon.sliver;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class N26069 {
    /**
     *사람들이 만난 기록이 시간 순서대로
     * $N$개 주어진다. (총총이는 토끼이지만 이 문제에서는 편의상 사람이라고 가정한다.)
     * 무지개 댄스를 추지 않고 있던 사람이 무지개 댄스를 추고 있던 사람을 만나게 된다면, 만난 시점 이후로 무지개 댄스를 추게 된다.
     * 기록이 시작되기 이전 무지개 댄스를 추고 있는 사람은 총총이 뿐이라고 할 때, 마지막 기록 이후 무지개 댄스를 추는 사람이 몇 명인지 구해보자!
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> set = new HashSet<>();

        set.add("ChongChong");

        for(int i = 0; i < n; i++){
            String str1 = sc.next();
            String str2 = sc.next();
            if( set.contains(str1) || set.contains(str2)){
                set.add(str1);
                set.add(str2);
            }
        }
        System.out.println(set.size());
    }

}
