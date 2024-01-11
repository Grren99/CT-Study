package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N10811 {

    /**
     * 5 4 5개의 바구니{1,2,3,4,5}, 4번 시행
     * 1 2 > {2,1,3,4,5}
     * 3 4 > {2,1,4,3,5}
     * 1 4 > {3,4,1,2,5}
     * 2 2 > {3,4,1,2,5}
     * **/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n개의 바구니
        int count = sc.nextInt(); // 시행 횟수

        int temp=0;

        int busket[] = new int[n];
        for(int i=0;i<busket.length;i++) {
            busket[i] = i+1;
        }

        for(int i=0;i<count;i++) {
            int a = sc.nextInt()-1; //1 > 0번째 배열
            int b = sc.nextInt()-1; //5 > 4번째 배열

            while(a<b) {
                temp = busket[a];
                busket[a] = busket[b];
                busket[b] = temp;
                // 반복문 끝내기 위한 연산자
                a++;
                b--;
            }
        }
        sc.close();

        for(int i=0;i<busket.length;i++) {
            System.out.print(busket[i]+" ");
        }


    }
}
