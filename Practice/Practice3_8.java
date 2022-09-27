package Practice;
import java.util.Scanner;

// 배열의 length 필드 
// 필드라는 말에서 알 수 있듯이, 함수가 아니어서 ()를 붙일 필요가 없다.
// 멤버필드는 변수 ! 즉 그냥 arr.length 이렇게 쓰면 됨

// 자바는 C와 다르게 배열 크기를 변수로 선언 가능하다.

public class Practice3_8 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int l;
		int sum = 0;
		double avg;
		
		System.out.print("배열의 크기를 입력하세요 >> ");
		l = s.nextInt();
		
		int arr[] = new int[l]; // 헐 배열 크기에 변수 들어가는거 가능 ?? 가능 !!
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}
		
		avg = (double)sum / arr.length;
		
		System.out.println("평균은 " + avg);
		
		s.close();
		
		
	
	}
}
