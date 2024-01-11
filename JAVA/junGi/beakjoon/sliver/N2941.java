package JAVA.junGi.beakjoon.sliver;

import java.util.Arrays;
import java.util.Scanner;

public class N2941 {
    /**
     * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
     * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String[] patterns = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String pattern : patterns) {
            str = str.replace(pattern, "x"); // 패턴 -> x로 변경
        }
        System.out.println(str.length());

    }
}
