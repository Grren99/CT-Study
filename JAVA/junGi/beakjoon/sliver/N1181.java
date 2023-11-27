package JAVA.junGi.beakjoon.sliver;

import java.util.*;

public class N1181 {
    /**
     * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
     * 길이가 짧은 것부터
     * 길이가 같으면 사전 순으로
     * 단, 중복된 단어는 하나만 남기고 제거해야 한다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        Set<String> set = new HashSet<>();

        for(int i = 0; i < index; i++){
            String value = sc.next();
            set.add(value);
        }
        List<String> list = new ArrayList<>(set);

        Collections.sort(list , (a , b) -> {
            if(a.length() == b.length()){
                return a.compareTo(b);
            }else{
                return a.length() - b.length();
            }
        });

        for (String word : list){
            System.out.println(word);
        }
    }
}
