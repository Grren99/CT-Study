package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;

public class N1010 {
    /**
     *재원이는 서쪽의 사이트와 동쪽의 사이트를 다리로 연결하려고 한다. (이때 한 사이트에는 최대 한 개의 다리만 연결될 수 있다.)
     * 재원이는 다리를 최대한 많이 지으려고 하기 때문에 서쪽의 사이트 개수만큼 (N개) 다리를 지으려고 한다. 다리끼리는 서로 겹쳐질 수 없다고 할 때
     * 다리를 지을 수 있는 경우의 수를 구하는 프로그램을 작성하라.
     */
    static int[][] dp = new int[30][30];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0 ; i < T; i++){
            //  nCr 에서 n = M, r = N이다.
            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(System(M, N));
        }
    }

    public static int System(int N , int M){

        if(dp[N][M] > 0){
            return dp[N][M];
        }

        if(N == M || M == 0){
            return dp[N][M] = 1;
        }

        return dp[N][M] = System(N - 1 , M -1) + System(N - 1 , M);

    }
}
