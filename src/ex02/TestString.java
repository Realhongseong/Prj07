package ex02;

public class TestString {

	public static void main(String[] args) {
		String name1 = "이순신";
		String name2 = "이순신";
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		String name3 = new String("킹세종");
		String name4 = new String("킹세종");
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));
	}

}
