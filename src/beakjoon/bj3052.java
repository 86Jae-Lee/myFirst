package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj3052 {

	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        int index = 0, result = 0;
        int num[] = new int [10];
        while ((str=br.readLine())!=null) {
        	num[index++] = Integer.parseInt(str)%42; // %42 배열에 저장
        }
        
        for (int i=0; i<num.length ; i++) {
        	for (int j=i+1; j<num.length ; j++) {
        		if(num[i]==num[j]) {
        			num [i]= -1; 
        		}
        	}
        }
                
        for (int i=0 ; i<num.length ; i++) {
        	if(num[i]!=-1) {
        		result++;
        	}
        }
        System.out.println(result);
	}
}