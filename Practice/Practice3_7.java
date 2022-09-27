package practice;
import java.util.Scanner;

// 배열생성
// C와 많이 다르다
// 1. int arr[] = new int[5];
// 2. int arr[]; -> 선언 
// 3. int[] arr; -> 선언 
// 4. arr = new int[5];
// 5. int intArray[] = new int[5];
// 안되는것 :int intArray[10] - > 배열의 크기를 지정하면 안된다 
//
// 하나의 배열을 다수의 레퍼런스가 참조 가능

public class Practice3_7 {
	public static void main(String args[]) {
		
		int intArray[] = new int[5]; //자바에서 배열 생성 
		Scanner s = new Scanner(System.in);
		int biggest = 0;
		
		for (int i = 0; i < 5; i++) {
			intArray[i] = s.nextInt();
		}
		
		for (int j = 0; j < 5; j++) {
			if (biggest <= intArray[j])
				biggest = intArray[j];
		}
		
		System.out.println(biggest);
		
		s.close();
		
		
	}
}
