
public class StrEqual {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Ja" + "va"; // found "Java"
		System.out.println(0 == s5.compareTo(s1)); // true
		
		String s3 = "Ja";
		String s4 = "va";
		String s5 = s3 + s4;
		System.out.println(s1 == s5); // false
		
		String s55 = s1;
		System.out.println(s55 == s5);// false;
		
		
		
		final String s6 = "Ja"; // found "Ja"
		final String s7 = "va"; // found "va"
		String s8 = s6 + s7; // found "Java"
		System.out.println(s1 == s8); // true
		
		
		
	}
}