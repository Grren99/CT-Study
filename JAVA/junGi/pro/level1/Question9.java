package JAVA.junGi.pro.level1;

public class Question9 {
        // 시저 암호
        // for문으로 charAt(i) 메소드를 이용하여 ch 변수에 받는다.
        // char은 26개의 문자로 이루어져있기때문에 ch+n이 'z'보다 크다면 26을 뺀 후 n만큼 더 한다. 아니라면 n을 더한 값을 그대로 answer에 더한다.
        public String solution(String s, int n) {
            String answer = "";

            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch == ' '){
                    answer+=ch;
                }
                if(ch >= 'a' && ch <= 'z'){
                    if(ch+n > 'z'){
                        answer += (char)(ch - 26 + n);
                    }else{
                        answer += (char)(ch + n);
                    }
                }else if(ch >= 'A' && ch <='Z'){
                    if(ch+n > 'Z'){
                        answer += (char)(ch - 26 + n);
                    }else{
                        answer += (char)(ch + n);
                    }
                }
            }
            return answer;
    }
}
