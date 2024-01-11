package JAVA.junGi.beakjoon.sliver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N10815 {
    /**
     * 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때
     * , 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.
     */
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;
    static int arr[];

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken()); // 입렵 값 넣어주기

        // 숫자 카드 오름차순 정렬
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 이분 탐색을 해서 해당 숫자가 있는 경우
            if(binarySearch(num)) bw.write("1 ");
                // 이분 탐색을 해서 해당 숫자가 없는 경우
            else bw.write("0 ");
        }

        bw.close();
        br.close();
    }
    // 이분 탐색 알고리즘
    private static boolean binarySearch(int num) {
        int leftIndex = 0;
        int rightIndex = n - 1;

        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2; // 중앙 인덱스
            int mid = arr[midIndex]; // arr의 중앙 값

            if(num < mid) rightIndex = midIndex - 1; // 입력 값이 중앙 값 보다 작다면  왼쪽 이동
            else if(num > mid) leftIndex = midIndex + 1; // 반대
            else return true; // 조건에 다 만족하지 않는 다면 리턴
        }
        return false;
    }
}
