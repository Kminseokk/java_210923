package java0811;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopyTest {
	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip")){
			millisecond = System.currentTimeMillis(); //파일복사를 시작하기전 시간
			int i;
		while( ( i = fis.read()) != -1){ //한바이트씩 읽고 쓰는 과정
			fos.write(i);
		}
			millisecond = System.currentTimeMillis() - millisecond; //파일복사에 걸리는 시간
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");
	}
}
