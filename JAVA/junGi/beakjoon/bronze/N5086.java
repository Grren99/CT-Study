package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N5086 {
    /**
     * 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String answer = "";

        while (true){
            int one = sc.nextInt();
            int two = sc.nextInt();

            if(one == 0 && two == 0) break;
            if(two % one == 0){
                System.out.println("factor");
            }else if(one % two == 0 ){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }
    }
}
