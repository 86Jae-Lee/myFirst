package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj2675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int testCase = 0, repeatSize = 0;
		String str;
		testCase = Integer.parseInt(br.readLine());
		
		for (int k=0 ; k<testCase ; k++) {
			st = new StringTokenizer(br.readLine());
			repeatSize = Integer.parseInt(st.nextToken());
			str = st.nextToken();
			
			for (int i=0 ; i<str.length() ; i++) {
				for (int j=0 ; j<repeatSize ; j++) {
					bw.write(str.charAt(i));
				}
			}
			bw.write("\n");
		}
		bw.close();
		br.close();
	}
}