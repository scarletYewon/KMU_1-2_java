package hello;
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 1;
		System.out.print("숫자 입력 : ");
		int largest = sc.nextInt();
		while(counter<10) {
			System.out.print("숫자 입력 : ");
			int number = sc.nextInt();
			if(number > largest) {
				largest = number;
			}
			counter ++;
		}
		System.out.println("가장 큰 수는 " + largest + "입니다.");
	}
}
