package JAVA.junGi.beakjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N9506 {
    /**
     * 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
     * 예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
     * n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
     */
    /**
     * 6
     * 12
     * 28
     * -1
     */

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true){

            int N = sc.nextInt();
            int sum = 0;
            if(N == -1) break;

            for(int i = 1; i <= N; i++){

                if(N % i == 0){
                    list.add(i);
                    sum += i;
                }
            }
            if (sum - N == N) {
                System.out.print(N + " = ");
                for(int i = 0; i < list.size() - 2; i++){
                    System.out.print(list.get(i) + " + ");
                }
                System.out.println(list.get(list.size() - 2));
            } else {
                System.out.println(N + " is NOT perfect.");
            }

            // 리스트와 합 초기화
            list.clear();
            sum = 0;

        }

    }
}
