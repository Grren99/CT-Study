package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;

public class N1316 {
    /**
     * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
     * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
     * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
     * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(); // 들어오는 단어의 수
        int cnt=num; // 단어의 수를 초기값으로 그룹단어가 아닐 시 -1을 하는 구조


        for(int roop = 0;roop<num; roop++) {  // 입력받은 단어의 수만큼 반복한다.
            String st = sc.next(); // 문자열 입력
            boolean[] TF = new boolean[26]; // 알파벳 배열을 만들어서 이미 체크한 알파벳은 true로 바꿔준다. (boolean 배열의 초기값은 false)

            for(int i=0;i<st.length()-1;i++) { // i와 i+1을 비교하는 과정이므로 <st.length()-1 을 해주었다.
                if(st.charAt(i)!=st.charAt(i+1)) { // i와 i+1이 다른경우 (현재 알파벳과 다음 알파벳을 비교)
                    if(TF[st.charAt(i+1)-97]==true) { // 이미 한번 체크된 알파벳일 경우 그룹단어가 되지 못하는 점
                        cnt--; // 그룹단어가 아니라고 판단 될 경우 초기값인 단어의 수에서 1씩 빼준다.  전체-그룹단어가 아닐경우 = 그룹단어인 경우
                        break; // 그룹단어가 아니라고 판단될 시 즉시 break로 빠져나온다. 이것을 안해 줄시 결과값이 -1,-3 등의 결과가 생길 수 있다. 여러번 반복해서 -1 되기떄문
                    }
                }
                TF[st.charAt(i)-97]=true; // 위의 처리가 다 끝났으면 해당 알파벳을 true처리 해주어 다음번에 반복되는경우 제외되도록 처리한다. -97은 아스키코드로 a가 97이니 -97해주어 a를 0으로 나오게함
            }
        }
        System.out.println(cnt); // 최종 cnt를 출력하여 그룹단어의 숫자를 출력한다.
    }

}
