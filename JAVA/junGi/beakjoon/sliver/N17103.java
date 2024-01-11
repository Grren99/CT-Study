package JAVA.junGi.beakjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N17103 {
    /**
     * 골드바흐의 추측: 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
     * 짝수 N을 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 한다.
     * 짝수 N이 주어졌을 때, 골드바흐 파티션의 개수를 구해보자. 두 소수의 순서만 다른 것은 같은 파티션이다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // 소수 구하기 = 소수 false
        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true; // 1보다 작거나 같으면 소수가 아님
        for (int i = 2; i * i <= 1000000; i++) {
            if (!num[i]) { // default false;
                for (int j = i + i; j <= 1000000; j += i) {
                    num[j] = true;
                }
            }
        }

        while (t-- > 0) {
            int temp = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 2; j <= temp / 2; j++) {
                if (!num[j] && !num[temp - j]) ans++;
            }
            System.out.println(ans);
        }
    }
}
