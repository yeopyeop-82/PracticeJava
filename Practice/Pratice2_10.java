package practice;
import java.util.Scanner;

// if문 사용하기 =>C랑같다.
public class Pratice2_10 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int score;
		System.out.print("점수를 입력하세요 : ");
		score = s.nextInt();
		
		if(score >= 80) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		s.close();
	}
}
