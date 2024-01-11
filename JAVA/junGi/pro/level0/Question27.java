package JAVA.junGi.pro.level0;
import java.util.*;

public class Question27 {

    // A를B로 만들기
    public int solution(String before, String after) {
        int answer = 0;

        char[] a = before.toCharArray();
        char[] b = after.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        String aS = new String(a);
        String bS = new String(b);

        answer = bS.equals(aS) ? 1 : 0;

        return answer;
    }
}
