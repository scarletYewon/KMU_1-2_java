package hello;
import java.util.Scanner;
public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] grade = new String[5];
		for(int i = 0;i<5;i++) {
			System.out.print("student"+(i+1)+":");
			grade[i] = sc.next();
		}
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for(int j=0;j<5;j++) {
			switch(grade[j]) {
				case "A": a+=1;
					break;
				case "B": b+=1;
					break;
				case "C": c+=1;
					break;
				case "D": d+=1;
					break;
			}
		}
		System.out.print("A:"+a+"��\n");
		System.out.print("B:"+b+"��\n");
		System.out.print("C:"+c+"��\n");
		System.out.print("D:"+d+"��\n");
	}
}
