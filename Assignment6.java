package hello;
import java.util.Scanner;
public class Assignment6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("4자리 수를 입력하세요:");
		String n = sc.next();
		int s = 0;
		for(int i = 0; i<4; i++) {
			s += Integer.parseInt(n.substring(i,n.length()-3+i));
		}
		System.out.println("각 자리수의 합은 "+s+"입니다.");
	}
}