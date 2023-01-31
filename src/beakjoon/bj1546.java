package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj1546 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double max = 0;
		double sum = 0;
		double [] line = new double [num];
		for(int i=0 ; i<num ; i++) {
			line[i] = Integer.parseInt(st.nextToken());
			if (line[i]>max) {
				max = line[i];
			}
			sum += line[i];
		}
		double avg = sum/max*100/num;
		bw.write(String.valueOf(avg));
		bw.flush();
		bw.close();
		br.close();
	}
}
