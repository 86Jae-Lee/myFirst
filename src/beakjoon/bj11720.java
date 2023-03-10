package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj11720 {

	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int numLine[] = new int[num];
        
        String str1 = br.readLine();
        for (int i=0 ; i<num ; i++) {
        	numLine[i] = Integer.parseInt(str1.split("")[i]); 
        }
        int sum = 0;
        for (int i=0 ; i<num ; i++) {
        	sum += numLine[i];
        }
        bw.write(String.valueOf(sum));
        bw.flush();
	}
}