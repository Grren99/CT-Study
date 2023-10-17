package JAVA.junGi.pro.level0;
import java.util.*;
public class Question12 {

    // 핳일 목록
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = new String[todo_list.length];
        int index = 0;
        for(int i = 0; i < todo_list.length; i++){
            if(finished[i] == false){
                System.out.println(todo_list[i]);
                answer[index] = todo_list[i];
                index++;
            }
        }

        return Arrays.copyOf(answer , index);
    }
}
