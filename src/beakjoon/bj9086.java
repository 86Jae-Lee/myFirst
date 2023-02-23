package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj9086 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		String[] caseString = new String[caseNum];
		StringBuilder sb = new StringBuilder();
		for (int i=0 ; i<caseNum ; i++) {
			caseString[i] = br.readLine();
			sb.append(caseString[i].substring(0,1)).append(caseString[i].substring(caseString[i].length()-1));
			sb.append("\n");
		}
		System.out.println(sb);
	}
}