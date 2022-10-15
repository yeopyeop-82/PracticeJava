package test2019;
import java.util.Random;

public class Array {
	public static void main(String[] args) {
		int intArray[][] = new int[4][4];
		int zeroCount = 0;
		int i, j;
		Random random = new Random();
		
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				intArray[i][j] = (random.nextInt(10) + 1);
			}
		}
		
		while (zeroCount < 6) {
			i = random.nextInt(4);
			j = random.nextInt(4);
			
			if (intArray[i][j] != 0) {
				intArray[i][j] = 0;
				zeroCount++;
			}
			
		}
		
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%d ", intArray[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
