package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj25304 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = Integer.parseInt(br.readLine());
		int caseNum = Integer.parseInt(br.readLine());
		int proSum = 0;
		for (int i=0 ; i<caseNum ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int pPrice = Integer.parseInt(st.nextToken());
			int pAmount = Integer.parseInt(st.nextToken());
			proSum += pPrice*pAmount;
		}
		
		if(sum==proSum) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}
		bw.flush();
	}
}