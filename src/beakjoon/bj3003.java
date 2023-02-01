package beakjoon;

import java.util.Scanner;

public class bj3003 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int king, queen, look, bishop, knight, phon;
		king = sc.nextInt();
		queen = sc.nextInt();
		look = sc.nextInt();
		bishop = sc.nextInt();
		knight = sc.nextInt();
		phon = sc.nextInt();
		System.out.println(1-king);
		System.out.println(1-queen);
		System.out.println(2-look);
		System.out.println(2-bishop);
		System.out.println(2-knight);
		System.out.println(8-phon);
		sc.close();
		
	}
}