import java.util.Scanner;

import java.util.Arrays;

public class Duplicate_Elimination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10부터 100 중 10개의 숫자를 입력 : ");
		int[] w = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		for(int i = 0; i<w.length; i++) {
			w[i] = sc.nextInt();
		}
		
		for(int i = 0; i<w.length; i++) {
			if(w[i] == -1) {
				continue;
			}
			for(int j = 0; j<w.length; j++) {
				if(w[i] == w[j] && i != j) {
					w[i] = -1;
				}
			}
		}
		
		for(int i = 0; i<w.length; i++) {
			if(w[i] == -1) {
				continue;
			}
			System.out.print(w[i] + " ");
		}
	}
}
