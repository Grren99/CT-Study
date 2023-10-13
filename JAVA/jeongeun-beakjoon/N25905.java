package beakjun;

import java.util.Scanner;

public class N25905 {

	public static void main(String[] args) {
//		장인은 도구를 탓하지 않는다
		Scanner scanner = new Scanner(System.in);
		double temp;
		double result = 1.0;
		double[] prob = new double[10];
		for(int i = 0; i < 10; i ++) {
			prob[i] = scanner.nextDouble();
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = i+1; j < 10; j++) {
				if(prob[i] < prob[j]) {
					temp = prob[i];
					prob[i] = prob[j];
					prob[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < 9; i++) {
			result *= (prob[i] / (i+1));
		}
		
		System.out.printf("%.6f",(result * Math.pow(10, 9)));
	}

}
