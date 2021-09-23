package java0810;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntArrayTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		
		sList.add("김사부");
		sList.add("서우진");
		sList.add("차은재");
		
		Stream<String> stream = sList.stream(); //스트림 생성. 내부적으로 ArrayList의 모든 요소를 가지고 있음
		stream.forEach(s->System.out.print(s + " ")); //배열의 요소를 하나씩 출력. 수행 후 자료 소모.
		System.out.println();
		sList.stream().sorted().forEach(s->System.out.print(s+ " ")); 
	}

}
