package practice;
import java.util.Scanner;

// /와%산술연산 실습 
public class Practice2_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int user_second;
		System.out.print("시간을 초 단위로 입력해주세요 : ");
		user_second = s.nextInt();
		
		int hour = user_second / 3600;
		int minute = (user_second % 3600) / 60;
		int second = (user_second % 3600) % 60;
		
		System.out.println("입력하신 시간은 " + hour + "시간 " + minute + "분 " + second + "초 입니다.");
		
		s.close();

	}

}
