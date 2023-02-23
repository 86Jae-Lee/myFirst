package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj10810 {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int numLine[] = new int[N];
		
		for (int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			for (int j= I-1 ; j<J ; j++) {
				numLine[i] = K;
			}
		}
		for (int i=0 ; i<numLine.length ; i++) {
			bw.write(numLine[i]+" ");
		}
		bw.flush();
	}
}
