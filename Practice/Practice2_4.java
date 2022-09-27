package practice;
import java.util.Scanner;

//예제 2-4 Scanner를 활용한 키 입력연습 
public class Practice2_4 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String name, city;
		int age, weight;
		boolean solo;
		
		System.out.print("이름을 입력하세요 : ");
		name = s.next(); // 문자열 읽기 .next()
		
		System.out.print("도시를 입력하세요 : ");
		city = s.next();
		
		System.out.print("나이를 입력하세요 : ");
		age = s.nextInt(); // 정수 읽기 .nextInt()
		// 문자열 next만 빼고 나머지는 nextFloat() 등등으로 자료형에 맞춰서 사용
		
		System.out.print("몸무게를 입력하세요 : ");
		weight = s.nextInt();
		
		System.out.print("독신여부를 입력하세요 : ");
		solo = s.nextBoolean();
		
		System.out.println("당신은 " + city + "에 사는 " + name + "(이)고, 나이는 " +
		age + " 살, 몸무게는 " + weight + "kg이고, 독신여부는 " +solo + "군요! 반갑습니다.");
		
		s.close();
		
	}
}
