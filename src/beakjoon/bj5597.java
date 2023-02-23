package beakjoon; // Error 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bj5597 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int num[] = new int [31];
		for (int i=0 ; i<28 ; i++) {
			int a = sc.nextInt();
			num[a] = 1; 
		}
		List<Integer> intList = new ArrayList<>();
		
		for (int i=1 ; i<=30 ; i++) {
			if (num[i]==0) {
				intList.add(i);
			}
		}
		Collections.sort(intList);
		for (int n : intList) {
			System.out.println(n);
		}
	}
}