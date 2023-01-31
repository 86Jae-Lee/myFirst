package beakjoon;

import java.util.Scanner;

public class bj1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n1, n2;
		if (num >= 10) {
			n1=num/10;
			n2=num%10;
		} else {
			n1 = 0;
			n2 = num%10;
		}
		int n3 = (n1+n2)%10;
		String NN = String.valueOf(n1+""+n2);
		int count = 0;
		
		while(true) {
			count++;
			n3 = (n1+n2)%10;
			n1 = n2;
			n2 = n3;
			String nn=String.valueOf(n1+""+n2);
			if(nn.equals(NN))
				break;
		}
		System.out.println(count);
		sc.close();
	}
}
