package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj2480 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num1, num2, num3;
		num1 = Integer.parseInt(st.nextToken());
		num2 = Integer.parseInt(st.nextToken());
		num3 = Integer.parseInt(st.nextToken());
		if (num1 == num2 && num2 == num3 && num1 == num3) {
			bw.write(String.valueOf(num1*1000+10000));
		} else if (num1 == num2 || num2 == num3) {
			bw.write(String.valueOf(num2*100+1000));
		} else if (num1 == num3) {
			bw.write(String.valueOf(num1*100+1000));
		} else {
			int i = Math.max(num1, num3);
			i = Math.max(num2, i);
			bw.write(String.valueOf(i*100));
		}	
		bw.flush();
	}
}
