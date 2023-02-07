package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj10871 {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int caseNum = Integer.parseInt(st.nextToken());
        int comNum = Integer.parseInt(st.nextToken());
        int Case[] = new int [caseNum];
        String str = br.readLine();
        String[] string = str.split(" ");
        for (int i=0 ; i<caseNum ; i++) {
        	Case[i] = Integer.parseInt(string[i]); 
        	if (Case[i]<comNum) {
        		bw.write(Case[i]+" ");
        	}
        }
        bw.flush();
	}
}
