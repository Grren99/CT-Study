package JAVA.junGi.beakjoon.bronze;
import java.util.Scanner;

public class N2903 {

    /**
     * 알고리즘을 시작하면서 상근이는 정사각형을 이루는 점 4개를 고른다. 그 후에는 다음과 같은 과정을 거쳐서 지형을 만든다.
     * 정사각형의 각 변의 중앙에 점을 하나 추가한다.
     * 정사각형의 중심에 점을 하나 추가한다.
     * 초기 상태에서 위와 같은 과정을 한 번 거치면 총 4개의 정사각형이 새로 생긴다. 이와 같은 과정을 상근이가 만족할 때 까지 계속한다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = 2;
        for (int i = 1; i <= n; i++) {
            res = (res - 1) + res;
        }
        System.out.println(res * res);
    }
}