package beakjoon;

public class bj4673 {

	public static void main(String[] args) {
		
		boolean [] nonSelf = new boolean [10001];
		for (int i=0 ; i<=10000 ; i++) {
			int n = noSelfNumber(i);
			if (n<=10000) nonSelf[n]=true; 	
		}

		for(int j=0 ; j<=10000 ; j++) {
			if (!nonSelf[j]) System.out.println(j);;
		}
		
	}

	static int noSelfNumber (int a) {
		int sum = a;
		while(a!=0) {
			sum+=a%10;
			a/=10;
		}
		return sum;
	}
}
