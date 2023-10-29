package JAVA.junGi.pro.level0;

public class Question30 {

    //로그인 성공?
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        int len = db.length;
        String id = id_pw[0];
        String pw = id_pw[1];
        for(int i = 0; i < id_pw.length; i++){

            for(int j = 0 ; j < len; j++){

                if(id.equals(db[j][0])){

                    if(pw.equals(db[j][1])){
                        answer = "login";
                    }else{
                        answer = "wrong pw";
                    }

                }

            }

        }



        return answer;
    }
}
