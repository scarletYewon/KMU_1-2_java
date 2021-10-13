package hello;
import java.util.Scanner;
public class Assignment5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변환하고자 하는 온도의 단위를 K(kelvin) 또는 C(Celsius)로 입력하세요:");
		String mode = sc.next();
		System.out.print("온도를 입력하세요:");
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