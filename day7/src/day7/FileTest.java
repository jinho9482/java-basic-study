package day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
// Data�� ���� (excel�̳� �޸���) �����ͼ� ���� ���
public class FileTest {

	public static void main(String[] args) throws IOException{
		String path = "C:\\ec-java\\day7\\src\\";
		File file = new File(path + "Test.txt");
		if(!file.canRead()) return;
		BufferedReader fr = new BufferedReader(new FileReader(file));

		while(true) {
			String st = fr.readLine();
			if (st == null) break;
			String[] strs = st.split("\t");
			System.out.println(Arrays.toString(strs));
		}
		fr.close(); // â ����
//		FileWriter;
		File file1 = new File(path + "Test1.txt");
		FileWriter fw = new FileWriter(file1); // filewriter�� ������ ������ ��������
		fw.append("��\t100");
		fw.close();
	}

}
