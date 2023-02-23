package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj1157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int [] arr = new int[26];
		for(int i=0 ; i<str.length() ; i++) {
			int temp = str.charAt(i);
			if(temp<97) {
				temp = temp-65;
			} else {
				temp = temp-97;
			}
			arr[temp]++;
		}
		int max =- 1, maxindex =- 1; //최대값 관련 변수
		boolean check=false;		 //max값이 중복된 값인지 확인하는 변수
		for(int i=0 ; i<arr.length ; i++) { //반복횟수 최대값 구하기
			if(arr[i]>max) {
				max = arr[i];
				maxindex = i;
				check = false;
			} else if (arr[i]==max) {
				check = true;
			}
		}
		char result = (char)(maxindex + 65);  //최대값 char로 변환
		if(check) {							  //bw에 저장
			bw.write("?\n");
		} else {
			bw.write(result+"\n");
		}
		bw.flush();
	}
}