package java0811;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopyTest {
	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip")){
			millisecond = System.currentTimeMillis(); //���Ϻ��縦 �����ϱ��� �ð�
			int i;
		while( ( i = fis.read()) != -1){ //�ѹ���Ʈ�� �а� ���� ����
			fos.write(i);
		}
			millisecond = System.currentTimeMillis() - millisecond; //���Ϻ��翡 �ɸ��� �ð�
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ϴ� �� " + millisecond + " milliseconds �ҿ�Ǿ����ϴ�.");
	}
}
