package JAVA.junGi.beakjoon.bronze;

import java.util.*;

public class N2750 {
    /**
     * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < index; i++){
            int N = sc.nextInt();
            set.add(N);
        }
        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        for(int value : list){
            System.out.println(value);
        }
    }

}
