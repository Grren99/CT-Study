package JAVA.junGi.beakjoon.bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class N25305 {
    /**
     * 첫째 줄에는 응시자의 수
     * $N$과 상을 받는 사람의 수
     * $k$가 공백을 사이에 두고 주어진다.
     * 둘째 줄에는 각 학생의 점수
     * $x$가 공백을 사이에 두고 주어진다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N명의 사람들
        int K = sc.nextInt(); // K번째까지 상

        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < N; i++){
            int X = sc.nextInt();
            list.add(X);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - K));

    }
}

