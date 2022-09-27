package Practice;

// for-each문 활용
// 파이썬 처럼 반복문 활용하기 
// 배열의 각 원소를 순차적으로 접근 (원소반복)
// for (int k : num)
// 이때, k에 num 배열의 값이 순차적으로 대입된다.

public class Practice3_9 {

	public static void main(String[] args) {
		int n[] = {1, 2, 3, 4, 5};
		String fruits[] = {"사과", "멜론", "딸기", "바나나"};
		
		for (int k : n) {
			System.out.print(k + " ");
		}
		
		for (String s : fruits) {
			System.out.print(s + " ");
		}

	}

}
