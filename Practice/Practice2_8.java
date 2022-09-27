package practice;
import java.util.Scanner;

//두 수의 차를 조건 연산을 이용 항상 양수가 나오게 !!

public class Practice2_8 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a, b;
		int result;
		System.out.print("두 수의 차를 구합니다. 정수 두개를 입력하세요 : ");
		a = s.nextInt();
		b = s.nextInt();
		
		result = ((a-b) >= 0) ? (a-b) : (b-a);
		System.out.println("두 수의 차는 " + result+"입니다.");
		
		s.close();
		
	}

}
