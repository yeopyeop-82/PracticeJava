package test2019;
import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		Scanner s = new Scanner(System.in);
		
		System.out.print("직사각형의 첫번째 점의 x1, y1 좌표를 차례로 입력하세요 : ");
		x1 = s.nextInt();
		y1 = s.nextInt();
		
		System.out.print("두번째 점의 x2, y2 좌표를 차례로 입력하세요 : ");
		x2 = s.nextInt();
		y2 = s.nextInt();
		
		s.close();
		
		if (((x1 >= 50) && (y1 >= 50)) ||
				((x2 <= 100) && (y2 <= 100))) {
					System.out.println("두 직사각형은 충돌합니다.");
				}
		else {
			System.out.println("두 직사각형은 충돌하지 않습니다. ");
		}
	}
}
