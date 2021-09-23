package java0810;

public class TestLambda {
	
	public static void main(String[] args) {
		PrintString lambdaStr = s->System.out.println(s); //인터페이스를 구현한 람다식을 변수에 대입
		lambdaStr.showString("hello lambda_1"); //그 변수를 사용해 람다식 구현부 호출
		
		showMyString(lambdaStr); //메서드 매개변수로 람다식 대입한 변수 전달
		PrintString reStr = returnString(); // 변수로 람다식을 반환받아
		reStr.showString("hello"); // 메소드 호출
		}
	
		public static void showMyString(PrintString p) { //메소드의 매개변수로 람다식 대입한 변수를 전달
			p.showString("hello lambda_2");
		}
		
		public static PrintString returnString() { //람다식의 반환 값으로 사용
			PrintString str = s -> System.out.println(s + "world");
			return str;
			//return s->System.out.println(s + "world");
	}
}

