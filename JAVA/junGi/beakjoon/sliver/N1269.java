package JAVA.junGi.beakjoon.sliver;

import java.util.*;

public class N1269 {
    /**
     * 자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B가 있다. 이때, 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오.
     * 두 집합 A와 B가 있을 때, (A-B)와 (B-A)의 합집합을 A와 B의 대칭 차집합이라고 한다.
     * 예를 들어, A = { 1, 2, 4 } 이고, B = { 2, 3, 4, 5, 6 } 라고 할 때,  A-B = { 1 } 이고, B-A = { 3, 5, 6 } 이므로, 대칭 차집합의 원소의 개수는 1 + 3 = 4개이다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for(int i = 0; i < A; i++){
            int Avalue = sc.nextInt();
            setA.add(Avalue);
        }
        int answer = 0;
        for(int i = 0; i < B; i++){
            int Bvalue = sc.nextInt();
            setB.add(Bvalue);
        }

        for(int num : setA){
            if(!setB.contains(num)){
                answer += 1;
            }
        }
        for(int num : setB){
            if(!setA.contains(num)){
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
