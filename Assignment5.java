package hello;
import java.util.Scanner;
public class Assignment5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȯ�ϰ��� �ϴ� �µ��� ������ K(kelvin) �Ǵ� C(Celsius)�� �Է��ϼ���:");
		String mode = sc.next();
		System.out.print("�µ��� �Է��ϼ���:");
		float temperature = sc.nextFloat();
		if (mode.equals("K")) {
			System.out.printf("%.2f",KtoC(temperature));
		}
		else {
			System.out.printf("%.2f",CtoK(temperature));
		}
	}
	public static float KtoC(float temperature){
		temperature-=273.15;
		return temperature;
	}
	public static float CtoK(float temperature){
		temperature+=273.15;
		return temperature;
	}
}