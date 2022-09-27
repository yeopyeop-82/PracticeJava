package Practice;

//비정방형 배열 생성 실습
// C에서는 비정방형 배열선언이 불가능하다
// 또또 !! 배열 다룰때는 항상 인덱스 주의. 배열 인덱스는 0에서부터 시작된다.

public class Practice3_11 {

	public static void main(String[] args) {
		int arr[][] = new int[4][]; // 일단은 행 개수만선언. 열은 비워둔다. 
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[2]; // 열 개수를 초기화. 그냥 열 접근하려고 하면 초기화 안되서안된다.
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j< arr[i].length; j++) { // length를 활용 !!! 
				arr[i][j] = (i + 1) * 10 + j;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
