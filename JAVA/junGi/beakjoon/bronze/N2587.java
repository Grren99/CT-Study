package JAVA.junGi.beakjoon.bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class N2587 {
    /**
     * 평균 이외의 또 다른 대표값으로 중앙값이라는 것이 있다. 중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다.
     * 예를 들어 10, 40, 30, 60, 30의 경우, 크기 순서대로 늘어 놓으면
     * 10 30 30 40 60
     * 이 되고 따라서 중앙값은 30이 된다.
     * 다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int avg = 0;
        int mid = 0;
        for(int i = 0 ; i < 5; i++){
            int N = sc.nextInt();
            list.add(N);
            avg += list.get(i);
        }
        Collections.sort(list);
        mid = list.get(2); // 중앙 값
        System.out.println( avg / list.size() + "\n" + mid);
    }
}
