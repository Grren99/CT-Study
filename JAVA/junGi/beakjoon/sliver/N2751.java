package JAVA.junGi.beakjoon.sliver;

import java.util.*;

public class N2751 {
    /**
     * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < index; i++){
            int value = sc.nextInt();
            list.add(value);
        }
        Collections.sort(list);
        // 한번에 출력하기 위한 작업
        for(int num : list){
            stringBuilder.append(num).append("\n"); // 모와 놓고 출력하면 시간이 줄어듬
        }
        System.out.println(stringBuilder);


    }
}
