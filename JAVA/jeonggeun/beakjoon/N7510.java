package beakjun;

import java.util.Arrays;
import java.util.Scanner;

public class N7510 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int n = scanner.nextInt();
		
		while(i < n) {
			int[] len = new int[3];
			for(int j = 0; j < 3; j ++) {
				len[j] = scanner.nextInt();
			}
			Arrays.sort(len);
			
			System.out.println("Scenario #" + (i+1) + ":");

			if(Math.pow(len[2],2) == Math.pow(len[0], 2) + Math.pow(len[1],2)) {
				System.out.println("yes");
				System.out.println();
			}else {
				System.out.println("no");
				System.out.println();
			}
			i++;
		}
	}

}
