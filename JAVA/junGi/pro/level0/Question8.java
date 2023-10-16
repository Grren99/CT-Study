package JAVA.junGi.pro.level0;

import java.util.ArrayList;
import java.util.List;

public class Question8 {
    // 리스트 자르기
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        switch(n){
            case 1 :
                for(int j = 0; j < b+1; j++){
                    result.add(num_list[j]);
                }
                break;
            case 2 :
                for(int j = a; j < num_list.length; j++){
                    result.add(num_list[j]);
                }
                break;
            case 3 :
                for(int j = a; j < b+1; j++){
                    result.add(num_list[j]);
                }
                break;
            case 4 :
                for(int j = a; j < b+1; j+=c){
                    result.add(num_list[j]);
                }
                break;
        }
        answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
