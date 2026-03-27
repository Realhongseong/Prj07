package ex01;

import java.util.Objects;

class Member{
	// Field
	private int num;
	private String name;
	private String tel;
	
	// Constructor
	public Member() {}

	public Member(int num, String name, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}

	// Method
	// toString
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + "]";
	}

	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(name, num, tel);
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		Member other = (Member) obj;
		return num == other.num;
			  // && Objects.equals(name, other.name);

	}
	
}

public class TestMemberArray {

	public static void main(String[] args) {
		// 여러명의 정보를 입력받아 검색 객체를 만들어 해당멤버를 찾는다
		/*
		Member m1 = new Member(1,"민지","010-1234-5678");
		Member m2 = new Member(2,"수지","010-1122-3344");
		Member m3 = new Member(3,"혜지","010-1212-3434");
		Member m4 = new Member(4,"은지","");	// 빈 문자열
		Member m5 = new Member(5,"예지","010-1324-5768");
		Member m6 = new Member(6,"지지",null);	// null

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);
		*/
		
		Member[] mArr = new Member[6];
		
		mArr[0] = new Member(1,"민지","010-1234-5678");
		mArr[1] = new Member(2,"수지","010-1122-3344");
		mArr[2] = new Member(3,"혜지","010-1212-3434");
		mArr[3] = new Member(4,"은지","");	// 빈 문자열
		mArr[4] = new Member(5,"예지","010-1324-5768");
		mArr[5] = new Member(6,"지지",null);	// null
		
		for (Member member : mArr) {
			System.out.println(member);
		}
		System.out.println("============================================");
		
		//찾을사람의 정보
		Member men = new Member(4,null, null);
		
		// == 주소비교로는 찾을수 없다 -> data 비교로 변경 : equals() 재정의
		boolean isFound = false;
		for (int i = 0; i < mArr.length; i++) {
			Member member = mArr[i];
			//System.out.println("member:" + member.hashCode());
			//System.out.println("men:" + men.hashCode());
			//if(member == men)
				//System.out.println(member);
			if(member.equals(men)) {
				System.out.println(member);
				isFound = true;
				break;	// 반복문 탈출
			}
		}
		// 못찾음
		if(!isFound)
			System.out.println("못찾음");
		
	}

}
