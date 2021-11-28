import java.security.SecureRandom;

public class Archery_Game {
	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		int[][] array = new int[4][5];
		int[] total_array = new int[4];
		int max = 0;
		
		for(int i = 0; i<array.length; i++) {
			array[i][0] = i+1;
			int sum = 0;
			for(int j = 1; j<array[i].length - 1; j++) {
				array[i][j] = 1 + randomNumbers.nextInt(10);
				sum += array[i][j];
			}
			total_array[i] = array[i][array[i].length-1] = sum;
		}
		
		System.out.println("선수번호\t점수1\t점수2\t점수3\t 합계");
		for(int i = 0; i<array.length; i++) {
//			System.out.print("player");
			for(int j = 0; j<array[i].length; j++) {
				System.out.print(array[i][j] + "\t ");
			}
			if(max < array[i][4]) max = array[i][4];
			System.out.println();
		}
		
		System.out.print("Player "); 
		for(int i = 0; i<array.length; i++) {
			if(array[i][4] == max) {
				System.out.print((i + 1) + " ");
			}
		}
		System.out.println("won");
	}
}
