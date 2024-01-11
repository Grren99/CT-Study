package JAVA.junGi.pro.level1;

public class Question2 {

        // 추억 점수
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];

            for(int i=0; i<photo.length; i++) { // photo 요소
                for(int j=0; j<photo[i].length; j++) {
                    for(int k=0; k<name.length; k++) {
                        if(photo[i][j].equals(name[k])) answer[i] += yearning[k];
                    }
                }
            }
            return answer;
        }
}
