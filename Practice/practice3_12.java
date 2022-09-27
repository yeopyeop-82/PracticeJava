package practice;

// 헐 자바 패키지 명은 소문자로 적는게 규칙이래요..
// 배열 리턴 실습
// 배열의 크기는 지정하지 않음
// int[] makeArray() {
// 이런식으로 지정합니다.

public class practice3_12 {
	
	static int[] makeArray() {
		int temp[] = {1, 2, 3, 4};
		return temp;
	}
	
	public static void main(String args[]) {
		int arr[] = makeArray(); // 받을 때는 걍 배열 받듯이 받습니다.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}