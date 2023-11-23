package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;

public class N1193 {

    /**
     * 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
     * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int n=0;
        int top=1;
        int bot=1;
        int cnt=0;
        if(X==1) {
            System.out.println("1/1");
        }else {
            while(cnt<X){
                n++;
                cnt=n*(n+1)/2; //몇번 째 행인지 찾는 코드
            }
            int num=X-(n-1)*n/2;  //행의 몇번 째 값인지 찾는 코드
            if(n%2==0) {  //짝수 행일 시
                top=num;
                bot=n-num+1;
            }else {
                top=n-num+1;
                bot=num;
            }
            System.out.println(top+"/"+bot);
        }

    }
}
