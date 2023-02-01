package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class bj2525 {

	public static void main(String[] args) throws IOException , NoSuchElementException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int H, M, time;
		H = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		time = Integer.parseInt(br.readLine());
		int AnswerH, AnswerM;
		AnswerM = (M+time)%60;
		AnswerH = H+(M+time)/60;
		if(AnswerH>23) {
			AnswerH = AnswerH%24;
		}
		bw.write(String.valueOf(AnswerH)+" "+String.valueOf(AnswerM));
		bw.flush();
	}

}
