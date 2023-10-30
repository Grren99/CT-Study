package JAVA.junGi.pro.level0;

public class Question33 {

        //안전 지대
        // 2차원 배열 문제 어려움
        public int solution(int[][] board) {
            int answer = 0;

            //위험지대 표시할 새로운 배열
            int [][] newBoard =  new int [board.length][board[0].length];

            //지뢰 위치 찾기
            for(int i=0 ; i< board.length; i++){

                for(int j=0 ; j< board[i].length; j++){

                    if(board[i][j]==1){

                        danger(i,j,newBoard);
                    }
                }
            }

            //출력
            // printTable(board);
            // printTable(newBoard);

            answer = countDanger(newBoard);

            return answer;
        }

        //지뢰 + 위험 지역 표시
        void danger(int i, int j, int[][] newBoard){

            int overX = newBoard.length;
            int overY = newBoard[0].length;

            newBoard[i][j] = 1;
            if(i > 0) newBoard[i-1][j] =1;
            if(i < overX-1) newBoard[i+1][j] =1;
            if(j < overY-1) newBoard[i][j+1] =1;
            if(j > 0) newBoard[i][j-1] =1;
            if(i > 0 && j>0) newBoard[i-1][j-1] =1;
            if(i < overX-1 && j>0) newBoard[i+1][j-1] =1;
            if(i > 0 && j<overY-1) newBoard[i-1][j+1] =1;
            if(i < overX-1 && j<overY-1) newBoard[i+1][j+1] =1;

        }
        //0 숫자세기
        int countDanger(int[][] board){

            int count =0 ;
            for(int i=0 ; i< board.length; i++){

                for(int j=0 ; j< board[i].length; j++){

                    if(board[i][j]==0){
                        count++;
                    }
                }
            }

            return count;
        }

        //확인용 출력
        void printTable(int[][] board){
            for(int i=0 ; i< board.length; i++){
                for(int j=0 ; j< board[i].length; j++){

                    System.out.print(board[i][j]);
                }
                System.out.println(" ");
            }
    }

}
