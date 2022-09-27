package Practice;
import java.util.Scanner;

//while 반복
public class Practice3_2 {
	public static void main (String args[]) {
		int i = 0;
		int sum = 0;
		Scanner s = new Scanner(System.in);
		
		while (i != -1) {
			sum += i;
			i = s.nextInt();
		}
	}
}
