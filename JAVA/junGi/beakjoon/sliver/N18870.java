package JAVA.junGi.beakjoon.sliver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class N18870 {
    /**
     * 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.
     * Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다.
     * X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[index];
        int[] origin = new int[index];
        for(int i = 0; i < index; i++){
            int value = sc.nextInt();
            arr[i] = origin[i] =value;
        }
        Arrays.sort(arr);

        int rank = 0;
        for(int num : arr){

            if(!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        // 원본 배열에 key 값을 출력 시켜 주기 => 최종 정답
        for(int answer : origin){
            int ranking = map.get(answer);
            stringBuilder.append(ranking).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
