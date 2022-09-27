package practice;
import java.util.Scanner;

//continue 문 활용 
public class Practice3_5 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		int n = 0;
		
		for (int i = 0; i < 5; i++) {
			n = s.nextInt();
			if (n >= 0) {
				sum += n;
			}
			else
				continue;
		}
		
		System.out.println(sum);
		
		s.close();

	}

}
