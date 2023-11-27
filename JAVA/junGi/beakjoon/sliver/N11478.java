package JAVA.junGi.beakjoon.sliver;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class N11478 {
    /**
     * 문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.
     * 부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
     * 예를 들어, ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.
     */
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < value.length(); i++) {
            for (int j = i; j < value.length(); j++) {
                set.add(value.substring(i, j + 1));
            }
        }
        System.out.println(set.size());

    }
}
