package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj2588 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num1 = Integer.parseInt(br.readLine());
		int numA = Integer.parseInt(br.readLine());
		int num2 = numA/100;
		int num3 = (numA%100)/10;
		int num4 = (numA%100)%10;
		bw.write(String.valueOf(num1*num4)+"\n");	
		bw.write(String.valueOf(num1*num3)+"\n");
		bw.write(String.valueOf(num1*num2)+"\n");
		bw.write(String.valueOf(num1*numA));
		bw.flush();
		bw.close();
		br.close();
	}
}
