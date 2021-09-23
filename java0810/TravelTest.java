package java0810;
import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		TravelCustomer customerDong = new TravelCustomer("동백", 35, 100);
		TravelCustomer customerHwang = new TravelCustomer("황용식", 32, 100);
		TravelCustomer customerKang = new TravelCustomer("강필구", 8, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerDong);
		customerList.add(customerHwang);
		customerList.add(customerKang);
		
		System.out.println("== 고객 명단 순서대로 출력 ==");
		//map() 사용하여 고객의 이름을 가져오고, forEach()로 이름 출력
		
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		//고객이 지불한 비용을 가져와서 mapToInt()로 값을 정수로 변환한 후 sum()으로 합을 구함
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행 비용은 :" + total + "입니다");
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		//filter()를 사용하여 20세 이상 추출, map()으로 이름 가져오고, sorted()로 이름을 정렬 => 중간연산
		//최종연산 forEach()를 활용하여 출력
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		}
}
