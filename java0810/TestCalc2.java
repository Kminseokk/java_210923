package java0810;

public class TestCalc2 {
	public static void main(String[] args) {
		int s1 = 5;
		int s2 = 6;
		
		Calc2 Calc2 = (s, v)-> s + v;
		System.out.println(s1+ "+" +s2+ "=" + Calc2.add(s1, s2));
	}
}
