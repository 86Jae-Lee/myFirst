package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj1065 { //한수

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());
		hanNum(inputNum);
	}
	
	static void hanNum(int num) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		if (num<100) {
			bw.write(num+"\n");
		} else {
			int stack = 99;
			for (int i=100 ; i<=num ; i++) {
				if (i<1000) {
					int first = i%10;
					int second = (i%100)/10;
					int third = (i%1000)/100;
					if ((second-first)==(third-second)) {
						stack++;
					}
				}
			}
			bw.write(stack + "\n");
		}
		bw.flush();
		bw.close();	
	}
}
