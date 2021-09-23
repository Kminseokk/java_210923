package java0810;

public class TestCalc {
	public static void main(String[] args) {
		int s1 = 5;
		int s2 = 6;
		
		Calc Calc2 = (s, v)->System.out.println(s + " + " + v  +" = " + s+v);
		Calc2.add(s1, s2); 
	}
}
