package hello;
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 1;
		System.out.print("���� �Է� : ");
		int largest = sc.nextInt();
		while(counter<10) {
			System.out.print("���� �Է� : ");
			int number = sc.nextInt();
			if(number > largest) {
				largest = number;
			}
			counter ++;
		}
		System.out.println("���� ū ���� " + largest + "�Դϴ�.");
	}
}
