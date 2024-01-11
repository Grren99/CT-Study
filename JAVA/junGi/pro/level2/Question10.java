package JAVA.junGi.pro.level2;
import java.util.Arrays;

public class Question10 {
    // 가장 큰 수
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        // int -> String 형 변환
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        // 내림차순 정렬 두 개의 문자 일 수 있어 compareTo 함수 이용
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }


        return answer.toString();
    }
}
