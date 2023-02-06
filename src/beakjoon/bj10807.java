package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj10807 {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());
        int [] Case = new int [caseNum];
        String st = br.readLine();
        String[] strings = st.split(" ");
        for (int i=0 ; i<caseNum ; i++) {
        	Case[i] = Integer.parseInt(strings[i]);
        }
        int comparison = Integer.parseInt(br.readLine());
        
        int count = 0;
        for (int i=0 ; i<caseNum ; i++) {
        	if (Case[i] == comparison) {
        		count += 1;
        	}
        }
		bw.write(String.valueOf(count));
		bw.flush();
	}
}
