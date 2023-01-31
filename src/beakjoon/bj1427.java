package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;


public class bj1427 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String lineString = br.readLine();
		String[] line = lineString.split("");
		Arrays.sort(line, Collections.reverseOrder());
		for (int i=0 ; i<lineString.length() ; i++) {
			bw.write(line[i]);
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
