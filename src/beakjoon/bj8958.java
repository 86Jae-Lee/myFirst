package beakjoon;
import java.util.*;

public class bj8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i=0 ; i<num ; ++i) {
			String OXcase = sc.nextLine();
			int score = 0;
			int N = 0;
			for(int j=0 ; j<OXcase.length() ; j++) {
				if(OXcase.charAt(j) == 'O') {
					N++;
					score = score + N*1;
				} else { 
					N=0;
				}
			}
			System.out.println(score);
		}
		sc.close();
	}
}