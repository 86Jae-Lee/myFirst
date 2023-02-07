package beakjoon; // Error 

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bj5597 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int num[] = new int [30];
		for (int i=0 ; i<30 ; i++) {
			num[i] = i+1;
		}
		List<Integer> intList = Arrays.stream(num).boxed().collect(Collectors.toList());
		
		for (int i=0 ; i<28 ; i++) {
			int a = sc.nextInt();
			intList.remove(a);
		}
		Collections.sort(intList);
		System.out.println(intList);
	}
}
