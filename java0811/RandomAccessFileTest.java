package java0811;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		rf.seek(0); //파일포인터위치를 맨 처음으로 이동
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("파일 포인터 위치:" + rf.getFilePointer()); //읽기가 끝나고 파일 포인터 위치 출력
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}

