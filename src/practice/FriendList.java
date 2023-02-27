package practice;

public class FriendList {

	public static void main(String[] args) {

		Friend[] frn = new Friend[10];
		int cnt = 0;
		
		frn[cnt++] = new UnivFriend("Lee Jae-Soon", "경영학과", "010-3325-6674");
		frn[cnt++] = new UnivFriend("An Dong-hun", "체육학과", "010-5448-6481");
		frn[cnt++] = new UnivFriend("Yoon Dong-Ju", "문예창작과", "010-3355-3432");
		frn[cnt++] = new CompFriend("Kim Jang-ho", "인사과", "010-3332-1236");
		frn[cnt++] = new CompFriend("Sang Oh-Jun", "구매과", "010-7764-3521");
		
		for (int i=0 ; i<cnt ; i++) {
			frn[i].showInfo();
			System.out.println();
		}
	}
}

class Friend {
	protected String name;
	protected String phoneNumber;
	
	public Friend(String na, String ph) {
		this.name = na;
		this.phoneNumber = ph;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
	}
}

class CompFriend extends Friend {
	private String department;
	
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		this.department = de;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("부서 : " + department);
	}
}

class UnivFriend extends Friend {
	private String major;
	
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		this.major = ma;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("학과 : " + major);
	}
}