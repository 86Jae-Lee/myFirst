package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int alpha[] = new int [26];
		Arrays.fill(alpha, -1);
		
		for (int i=0 ; i<str.length() ; i++) {
			if (alpha[charPlace(str.charAt(i))]>-1) {
				continue;
			} else {
				alpha[charPlace(str.charAt(i))] = i;
			}
		}
		
		for (int i=0 ; i<26 ; i++) {
			System.out.print(alpha[i]+" ");
		}
	}

	static int charPlace(char a) {
		int num = (int)a;
		num = num-97;
		return num;
	}
}