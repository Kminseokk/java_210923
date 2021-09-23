package java0810;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
	public static void main(String[] args) {
		
		List<Book> bookList = new ArrayList<>( );
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		//��Ʈ�� �����ϰ� ����ϱ�
		//��� å�� ������ ��, å�� ������ 20000�� �̻��� å�� �̸��� �����Ͽ� ������� ��Ʈ���� Ȱ���غ�����
		
		int total = bookList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		bookList.stream().filter(c->c.getPrice() >= 20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
