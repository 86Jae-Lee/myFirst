package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj10813 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
		int num = Integer.parseInt(stt.nextToken());
		int change = Integer.parseInt(stt.nextToken());
		int line[] = new int[num];
		for(int i=0 ; i<num ; i++) {
			line[i] = i+1; 
		}
		
		for(int i=0 ; i<change ; i++) {
			stt = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stt.nextToken())-1;
			int b = Integer.parseInt(stt.nextToken())-1;
			int temp = 0;
			temp = line[a];
			line[a] = line[b];
			line[b] = temp;
		}
		for (int i=0 ; i<line.length ; i++) {
			bw.write(line[i]+" ");
		}
		bw.flush();
	}

}
