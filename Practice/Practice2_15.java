package Practice;
import java.util.Scanner;

//Switch 문 활용 
public class Practice2_15 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("커피 이름을 입력해주세요 : ");
		String name = s.next();
		int price = 0;
		
		switch (name) {
		case "에스프레소" :
		case "카푸치노" :
		case "카페라떼" :
			price = 3500;
			break;
		case "아메리카노" :
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다.");
		}
		
		if(price != 0) {
			System.out.println("입력하신 메뉴는 " + price + "원입니다.");
		}
		
		s.close();
	}
}
