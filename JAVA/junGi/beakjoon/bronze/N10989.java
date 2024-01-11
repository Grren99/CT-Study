package JAVA.junGi.beakjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N10989 {
    /**
     * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int index = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[index];

        for(int i = 0 ; i < index; i++){
            int value = Integer.parseInt(bufferedReader.readLine());
            arr[i] = value;
        }
        Arrays.sort(arr);

        for(int num : arr){
            stringBuilder.append(num).append("\n");
        }
        System.out.println(stringBuilder);



    }
}
