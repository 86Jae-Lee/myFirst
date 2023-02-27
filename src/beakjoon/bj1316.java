package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj1316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int caseNum = Integer.parseInt(br.readLine());
		String[][] words = new String[caseNum][2];
		StringTokenizer stt;
		for (int i=0 ; i<caseNum ; i++) {
			words[i][0] = br.readLine(); 
		}
		
		
		
	}
}
