package hello;
import java.util.Scanner;
public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("item1 ÆÇ¸Å °¹¼ö : ");
		int item1 = sc.nextInt();
		System.out.print("item2 ÆÇ¸Å °¹¼ö : ");
		int item2 = sc.nextInt();
		System.out.print("item3 ÆÇ¸Å °¹¼ö : ");
		int item3 = sc.nextInt();
		System.out.print("item4 ÆÇ¸Å °¹¼ö : ");
		int item4 = sc.nextInt();
		
		float sum = (float) (item1 * 239.99) + (float) (item2 * 129.75) + (float) (item3 * 99.95) + (float) (item4 * 350.89);
		float money = (float) ((sum * 0.09) + 200);
		System.out.printf("°á°ú : %.2f$", money);
		
	}
}
