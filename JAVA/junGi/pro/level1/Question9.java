package JAVA.junGi.pro.level1;

public class Question9 {
        // 시저 암호
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
