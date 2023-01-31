package beakjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class bj2557 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = "Hello World!";
		bw.write(st);
		bw.flush();
		bw.close();
	}

}
