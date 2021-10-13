package hello;
import java.util.Scanner;
public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 5개를 띄어쓰기로 구분하여 입력하세요:");
		int[] Value = new int[5];
		for(int i = 0;i<5;i++) {
			Value[i] = sc.nextInt();
		}
		int a = 0;
		while(a<5) {
			for(int j=0;j<Value[a];j++){
				System.out.print("*");
			}
			a++;
			System.out.println();
		}
	}
}
