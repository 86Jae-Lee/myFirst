package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj10952 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int answer = 0;
		while (Integer.parseInt(st.nextToken())==0) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			answer = a+b;
			bw.write(String.valueOf(answer)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
