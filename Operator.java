
public class Operator {
	public static void main(String[] args) {
		//System.out.println(sizeof(args)); // cannot find symbol sizeof
		String str = new String();
		boolean bRet = str instanceof String;
		System.out.println(bRet);
		
		byte byteValue = -3;
		byteValue >>>= 2; // -1 signed bit is not changged.
		System.out.println(byteValue);
	}
}