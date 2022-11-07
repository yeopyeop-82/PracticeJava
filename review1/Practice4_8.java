package review1;

class ArrayPrint {
	
	public ArrayPrint() {}
	
	public void printCharArray(char c[]) {
		for (int i = 0; i < c.length ;i++) {
			System.out.print(c[i] + " ");
		}
	}
	
	public char[] replaceSpace(char c[]) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';
			}
		}
		
		return c;
	}
}

public class Practice4_8 {
	public static void main(String[] args) {
		char c[] = {'h', 'e', 'l','l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!', ' '};
		ArrayPrint a = new ArrayPrint();
		
		a.printCharArray(c);
		
	}
}
