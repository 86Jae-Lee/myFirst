package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj11654 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char cr = (br.readLine()).charAt(0);
		asciCode(cr);
		
	}
	
	public static void asciCode(char c) {
		System.out.println((int)c);
	}
}