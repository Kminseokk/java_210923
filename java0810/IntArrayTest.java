package java0810;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntArrayTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		
		sList.add("����");
		sList.add("������");
		sList.add("������");
		
		Stream<String> stream = sList.stream(); //��Ʈ�� ����. ���������� ArrayList�� ��� ��Ҹ� ������ ����
		stream.forEach(s->System.out.print(s + " ")); //�迭�� ��Ҹ� �ϳ��� ���. ���� �� �ڷ� �Ҹ�.
		System.out.println();
		sList.stream().sorted().forEach(s->System.out.print(s+ " ")); 
	}

}
