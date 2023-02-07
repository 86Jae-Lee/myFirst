package beakjoon;

import java.util.*;

public class bj2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] list = new int [9];
		int listSize = list.length;
		
		for(int i=0 ; i<listSize ; ++i) {
			list[i] = sc.nextInt();
		}
		
		int max = 0;
		int maxindex = 0;
		for(int i=0; i<listSize ; ++i) {
			if(max < list[i]) { max = list[i] ; maxindex = i;}
		}
		
		System.out.println(max);
		System.out.println(maxindex+1);
	}
}