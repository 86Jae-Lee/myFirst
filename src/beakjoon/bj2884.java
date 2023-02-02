package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj2884 { //

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		if (M <45) {
			if (H==0) {
				bw.write("23 "+String.valueOf(M+15));
			} else {
				bw.write(String.valueOf(H-1)+" "+String.valueOf(M+15));
			}
		} else {
			bw.write(String.valueOf(H)+" "+String.valueOf(M-45));
		}
		bw.flush();
	}
}
