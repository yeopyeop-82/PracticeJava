package Practice;
import java.util.Scanner;

// break문 활
// 문자열은 C에서는 배열로 다뤄지지만, 자바에서는 객체로 다뤄진다.
// 따라서 문자열에 관련한 다양한 메소드 활용 가능 

public class Practice3_6 {

	public static void main(String args[]) {
		String esc = " ";
		Scanner s = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		
		while (true) {
			System.out.print(">>");
			esc = s.next();
			if (esc.equals("exit")) //문자열 비교 메소드
				break;
			else
				continue;
		}
		
		s.close();
	}
}
