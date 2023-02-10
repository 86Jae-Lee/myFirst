package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class bj14425 { //집합 2번 
	static int numS, numCom;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	int answer = 0;
    	numS = Integer.parseInt(st.nextToken());
    	numCom = Integer.parseInt(st.nextToken());
		
		HashSet<String> map = new HashSet<>();
		for(int i=0 ; i<numS ; i++) {
			map.add(br.readLine());
		}
    	
		for (int i=0 ; i<numCom ; i++) { 
			String str = br.readLine();
			if(map.contains(str))
				answer++;
		}
		br.close();
		bw.write(answer + "\n");
		bw.flush();
	}
}