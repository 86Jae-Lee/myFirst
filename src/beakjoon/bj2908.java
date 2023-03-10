package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj2908 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
		String str1 = stt.nextToken();
		String str2 = stt.nextToken();
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = new StringBuilder(str2);
		sb1 = sb1.reverse();
		sb2 = sb2.reverse();
		str1 = sb1.toString();
		str2 = sb2.toString();
		int a = Integer.parseInt(str1), b = Integer.parseInt(str2);
		if (a>b) bw.write(String.valueOf(a));
		if (b>a) bw.write(String.valueOf(b));
		bw.flush();
	}
}