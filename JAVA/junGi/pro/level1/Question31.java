package JAVA.junGi.pro.level1;
import java.util.*;

public class Question31 {
    // 둘만의 암호
    public String solution(String s, String skip, int index) {
        String answer = "";

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int count = 1;
            while(count <= index){
                ++c;
                if(c > 'z')
                    // 아스키 코드 값 빼주기
                    c -= 26;
                if(skip.contains(c+""))
                    continue;
                else
                    count++;
            }
            answer += c;
        }
        return answer;
    }
}
