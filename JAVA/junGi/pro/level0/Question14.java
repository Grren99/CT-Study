package JAVA.junGi.pro.level0;

public class Question14 {

        //조건에 맞게 수열 변환하기 2
        // clone 활용
        public int solution(int[] arr) {
            int answer = 0;
            int count = 0;
            int[] beforArr = new int[arr.length];
            while(count != arr.length) {
                count = 0;
                beforArr = arr.clone();
                for(int i =0; i<arr.length; i++) {
                    if(arr[i]%2 == 0 && arr[i] >= 50) {
                        arr[i] /= 2;
                    }else if(arr[i]%2 != 0 && arr[i] < 50) {
                        arr[i] = arr[i]*2 +1;
                    }
                    if(arr[i] == beforArr[i] ) count ++;
                }
                answer ++;
            }

            return answer-1;
    }
}
