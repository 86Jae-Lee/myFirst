package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;



public class AGrammar {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder stb = new StringBuilder();
		stb.append(" ");

		int num1 = 0;
		int[] num = new int[num1];
		HashSet<Integer> ha = new HashSet<Integer>();
		for (int i=0; i<num1 ; i++) {
			int num2 = Integer.parseInt(st.nextToken());
			ha.add(num2);
		}
		int answer = 0;
		for (int i=0 ; i<num1 ; i++) { 
			String str = br.readLine();
			if(ha.contains(str))
				answer++;
		}
		
		ArrayList<String> aList = new ArrayList<String>();
		for (int i=0; i<num1 ; i++) {
			aList.add(null);
		}
		
	}
}
