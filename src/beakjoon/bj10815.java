package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class bj10815 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cardNum = Integer.parseInt(br.readLine());
		int[] cardList = new int[cardNum];
		HashSet<Integer> map = new HashSet<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0 ; i<cardNum ; i++) {
			int num = Integer.parseInt(st.nextToken());
			map.add(num);
		}
		
		int comNum = Integer.parseInt(br.readLine());
		int comList[] = new int [comNum];
		String str2 = br.readLine();
		String[] Str2 = str2.split(" ");
		
		for (int i=0 ; i<comNum ; i++) {
			comList[i]=Integer.parseInt(Str2[i]);
		}
		
		for (int i=0 ; i<comNum ; i++) {
			if (map.contains(comList[i])) {
				bw.write(1+" ");
			} else {
				bw.write(0+" ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
