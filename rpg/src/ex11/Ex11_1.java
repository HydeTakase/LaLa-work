package ex11;

public class Ex11_1 {

	public static void main(String[] args) {
		Book book = new Book("ゲド戦記", 720, "緑", "978-4-00-114588-5");

		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getColor());
		System.out.println(book.getIsbn());

	}

}
