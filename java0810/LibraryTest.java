package java0810;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
	public static void main(String[] args) {
		
		List<Book> bookList = new ArrayList<>( );
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		//스트림 생성하고 출력하기
		//모든 책의 가격의 합, 책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력위해 스트림을 활용해보세요
		
		int total = bookList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		bookList.stream().filter(c->c.getPrice() >= 20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
