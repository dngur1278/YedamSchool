package co.yedam.app.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileSaveTest {

	public static void main(String[] args) {
		// byte -> stream , char(2~3) -> reader,write
		try {
			// InputStreamReader = 1자씩 받음, BufferedReader를 씌우면 여러 글자를 받을 수 있음
			BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter br = new BufferedWriter(new FileWriter("d:/temp/f.dat"));

			while (true) {
				String c = isr.readLine();
				if (c == null)
					break;
				br.write(c);
				br.write("\n");
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
