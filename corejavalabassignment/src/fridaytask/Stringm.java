package fridaytask;

public class Stringm {

	public static void main(String[] args) {
		String s = new String("Hello World");
		int a = s.length();
		System.out.println(a);
		String s1 = "Hi";
		s1 = s1 + s;
		System.out.println(s1);

		String s2 = s.substring(3);
		System.out.println(s2);
		String s3 = s.substring(3, 8);
		System.out.println(s3);

		String s4 = s.toLowerCase();
		System.out.println(s4);
		String s5 = s.toUpperCase();
		System.out.println(s5);

		String s6 = s.replace('l', 'i');
		System.out.println(s6);

		String s7 = "string";
		String s8 = "string";
		System.out.println(s7.equals(s8));
		String s9 = "different";
		String s10 = "Diff";
		System.out.println(s9.compareTo(s9));

	}
}