
public class CharacterTest {
	public static void main(String[] args) {
		Character ch = 'a';
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isUpperCase(ch));
		System.out.println(Character.isLowerCase(ch));
		System.out.println(Character.isWhitespace(ch));
		System.out.println(Character.toUpperCase(ch));
		System.out.println(Character.toLowerCase(ch));
		System.out.println(Character.toString(ch));
		
		char chNum = ch.charValue();
	}
}