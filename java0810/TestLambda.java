package java0810;

public class TestLambda {
	
	public static void main(String[] args) {
		PrintString lambdaStr = s->System.out.println(s); //�������̽��� ������ ���ٽ��� ������ ����
		lambdaStr.showString("hello lambda_1"); //�� ������ ����� ���ٽ� ������ ȣ��
		
		showMyString(lambdaStr); //�޼��� �Ű������� ���ٽ� ������ ���� ����
		PrintString reStr = returnString(); // ������ ���ٽ��� ��ȯ�޾�
		reStr.showString("hello"); // �޼ҵ� ȣ��
		}
	
		public static void showMyString(PrintString p) { //�޼ҵ��� �Ű������� ���ٽ� ������ ������ ����
			p.showString("hello lambda_2");
		}
		
		public static PrintString returnString() { //���ٽ��� ��ȯ ������ ���
			PrintString str = s -> System.out.println(s + "world");
			return str;
			//return s->System.out.println(s + "world");
	}
}

