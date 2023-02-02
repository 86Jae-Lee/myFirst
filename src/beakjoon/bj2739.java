package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj2739 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		for(int i=1 ; i<=9 ; i++) {
			bw.write(String.valueOf(num)+" * "+String.valueOf(i)+" = "+String.valueOf(num*i)+"\n");
		}
		bw.flush();
	}
}