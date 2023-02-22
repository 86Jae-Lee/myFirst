package beakjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class bj11382 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc1 = new Scanner(System.in);
		long a,b,c;
		a = sc1.nextLong();
		b = sc1.nextLong();
		c = sc1.nextLong();
		long result = a+b+c;
		bw.write(String.valueOf(result));
		bw.flush();
	}
}