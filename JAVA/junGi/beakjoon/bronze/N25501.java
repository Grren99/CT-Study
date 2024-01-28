package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N25501 {
    /**
     * 정휘는 후배들이 재귀 함수를 잘 다루는 재귀의 귀재인지 알아보기 위해 재귀 함수와 관련된 문제를 출제하기로 했다.
     * 팰린드롬이란, 앞에서부터 읽었을 때와 뒤에서부터 읽었을 때가 같은 문자열을 말한다. 팰린드롬의 예시로 AAA, ABBA, ABABA 등이 있고,
     * 팰린드롬이 아닌 문자열의 예시로 ABCA, PALINDROME 등이 있다.
     * 어떤 문자열이 팰린드롬인지 판별하는 문제는 재귀 함수를 이용해 쉽게 해결할 수 있다. 아래 코드의 isPalindrome 함수는 주어진 문자열이 팰린드롬이면 1,
     * 팰린드롬이 아니면 0을 반환하는 함수다.
     */
    static int count;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String str = sc.next();
            // 새로운 카운트 호출시 0 으로 초기화
            count = 0;
            System.out.println(isPalindrome(str) + " " + count);

        }
    }

    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
