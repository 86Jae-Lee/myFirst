package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class bj1181 {
	
	public static void main(String[] args) throws Exception {

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(bReader.readLine());
		String[] strings = new String [num];
		for (int i=0 ; i<num ; i++) {
			strings[i] = bReader.readLine(); 
		}	
		
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(strings));
		
		String[] resultStrings = hashSet.toArray(new String[0]);
		Arrays.sort(resultStrings);
		Arrays.sort(resultStrings, Comparator.comparing(String::length));
		
		
		for(int i=0 ; i<resultStrings.length ; i++) {
			bWriter.write(String.valueOf(resultStrings[i]));
			bWriter.newLine();
		}
		bWriter.flush();
	}
}
