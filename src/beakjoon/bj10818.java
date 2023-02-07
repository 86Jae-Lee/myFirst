package beakjoon; //수정하자!!

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class bj10818 {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());
        String str1 = br.readLine();
        String[] str2 = str1.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0 ; i<caseNum ; i++) {
        	list.add(str2[i]);
        }
        Collections.sort(list);
        
        bw.write(list.get(0)+" "+list.get(caseNum-1));
        bw.flush();
	}
}