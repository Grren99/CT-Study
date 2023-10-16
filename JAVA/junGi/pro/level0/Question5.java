package JAVA.junGi.pro.level0;

public class Question5 {

    // 접미사인지 확인하기
    // endWith함수 이용
    // startsWith -> 접두사 함수 이용 가능
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i ++){
            if(my_string.endsWith(is_suffix)){
                answer = 1;
            }else{
                answer = 0;
            }
        }
        return answer;
    }
}
