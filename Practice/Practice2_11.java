package Practice;
import java.util.Scanner;

// if-else
public class Practice2_11 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 하나를 입력 : ");
		int num = s.nextInt();
		
		if (num % 3 == 0) {
			System.out.println("입력한 수는 3의 배수입니다. ");
		}
		else {
			System.out.println("입력한 수는 3의 배수가 아닙니다.");
		}
		
		s.close();
	}
}
