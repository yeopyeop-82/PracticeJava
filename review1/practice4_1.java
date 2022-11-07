package review1;

class Book {
	private String title;
	private String author;
	
	public Book (String t) {
		title = t;
		author = "Jane doe";
	}
	
	public Book (String t, String a) {
		title = t;
		author = a;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
}

public class Practice4_1 {
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.getTitle() + " " + littlePrince.getAuthor());
		System.out.println(loveStory.getTitle() + " " + loveStory.getAuthor());
	}
}
