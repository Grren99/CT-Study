package JAVA.junGi.beakjoon.sliver;

import java.util.Arrays;
import java.util.Scanner;

public class N10816 {
    /**
     * 이분 탐색
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            arr[i] = value;
        }
        Arrays.sort(arr);

        int m = sc.nextInt();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < m; i++){
            int value = sc.nextInt();
            int lower = lowerBound(arr, value);
            int upper = upperBound(arr, value);
            stringBuilder.append(upper - lower).append(" ");
        }
        System.out.println(stringBuilder);

    }
    private static int lowerBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        // lo가 hi랑 같아질 때 까지 반복
        while (lo < hi) {

            int mid = (lo + hi) / 2; // 중간위치를 구한다.
            /*
             *  key 값이 중간 위치의 값보다 작거나 같을 경우
             *
             *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
             */
            if (key <= arr[mid]) {
                hi = mid;
            }

            else {
                lo = mid + 1;
            }

        }
        return lo;
    }

    private static int upperBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        // lo가 hi랑 같아질 때 까지 반복
        while (lo < hi) {

            int mid = (lo + hi) / 2; // 중간위치를 구한다.

            // key값이 중간 위치의 값보다 작을 경우
            if (key < arr[mid]) {
                hi = mid;
            }
            // 중복원소의 경우 else에서 처리된다.
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
