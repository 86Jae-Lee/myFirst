package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj10430 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A, B, C;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf((A+B)%C)+"\n");
		bw.write(String.valueOf(((A%C)+(B%C))%C)+"\n");
		bw.write(String.valueOf((A*B)%C)+"\n");
		bw.write(String.valueOf(((A%C)*(B%C))%C));
		bw.flush();
		bw.close();
		br.close();
	}
}
