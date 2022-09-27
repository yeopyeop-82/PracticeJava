package Practice;
import java.util.Scanner;

//2차원 배열실습
// 자바에서는 비정방형 배열 선언이 가능하다.
//배열을 다룰때는 언제나 인덱스 주의 !!!

public class Practice3_10 {

	public static void main(String[] args) {
		double score[][] = new double[4][2]; // 2차원 배열을 선언하려면 처음에 [][] 을 선언해야함
		Scanner s = new Scanner(System.in);
		double sum = 0;
		double average = 0;
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print(i + "학년 "+ j + "학기 평점을 입력하세요 >> ");
				score[i-1][j-1] = s.nextDouble();
			}
		}
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.println(i + "학년 " +j + "학기 성적 " + score[i-1][j-1]); // 인덱스 주의 !!!!!!
				sum += score[i-1][j-1];
			}
		}
		
		average = sum / 8.0;
		
		System.out.print("4년간 전체 평점평균은 " +average + "점 입니다.");
		
		s.close();
		
		

	}

}
