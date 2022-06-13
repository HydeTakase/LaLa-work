package chap16.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("ゲド戦記", "アーシュラ・K・ル=グウィン");
		Book b2 = new Book("ガンダムUC", "富野由悠季");
		Book b3 = new Book("スラムダンク", "井上雄彦");
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);

		for (Book b: bookList) {
			System.out.println("「" +b.getTitle() +"」" + "著者 :" + b.getAuthor() );
		}
		
		

	}

}
