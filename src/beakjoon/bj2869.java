package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		
		int a, b, v;
		
		a = Integer.parseInt(st1.nextToken());
		b = Integer.parseInt(st1.nextToken());
		v = Integer.parseInt(st1.nextToken());
		
		System.out.println(calfunc(a, b, v));
	}

	static int calfunc(int a, int b, int v) {
		int differ=0;
		int count = 0;
		while (true) {
			count++;
			a = a+differ;
			if(a>v) {
				break;
			}
			differ = a-b;
		}
		return count;
	}
}
