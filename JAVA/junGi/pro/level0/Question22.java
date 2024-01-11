package JAVA.junGi.pro.level0;
import java.math.BigInteger;

public class Question22 {

    // 두 수의 합
    // 숫자가 너무 커져서 BigInteger 활용
        public String solution(String a, String b) {
            try {
                BigInteger numA = new BigInteger(a);
                BigInteger numB = new BigInteger(b);
                BigInteger sum = numA.add(numB);
                return sum.toString();
            } catch (NumberFormatException e) {
                return "Invalid input";
        }
    }


}
