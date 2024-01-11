package JAVA.junGi.beakjoon.bronze;

import java.util.Map;
import java.util.Scanner;

public class N5073 {
    /**
     * 삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
     * Equilateral :  세 변의 길이가 모두 같은 경우
     * Isosceles : 두 변의 길이만 같은 경우
     * Scalene : 세 변의 길이가 모두 다른 경우
     * 단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다.
     * 예를 들어 6, 3, 2가 이 경우에 해당한다. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
     * 세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String answer = "";
        while (true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int maxValue = Math.max(A , Math.max(B , C)); // 가장 큰 값
            int minValue = Math.min(A , Math.min(B , C)); // 가장 작은 값
            int middleValue = A + B + C - maxValue - minValue; // 중간 값

            if (maxValue == 0 && middleValue == 0 && minValue == 0){
                break;
            }
            else if(maxValue >= middleValue + minValue){
                System.out.println("Invalid");
                continue;
            }
            else if(A == B && B == C){
                answer = "Equilateral";
            }else if(A == B || B == C || C == A){
                answer = "Isosceles";
            }else{
                answer = "Scalene";
            }
            System.out.println(answer);
        }
    }
}