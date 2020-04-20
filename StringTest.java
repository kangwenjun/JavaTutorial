
public class StringTest {
	public static void main(String[] args) {
		String strSite = "www.kangwenjun.com";
		System.out.println(strSite.length());
		
		strSite = "Hello, " + strSite;
		strSite += "!";
		System.out.println(strSite);
		
		String strTmp = strSite.format("site:%s", "www.kangwenjun.com");
		System.out.println(strTmp);
		strTmp = String.format("site:%s", "www.kangwenjun.com");
		System.out.println(strTmp);
		
		char ch = strSite.charAt(0);
		System.out.println(strSite.compareTo("www.kangwenjun.com"));
		System.out.println(strSite.compareToIgnoreCase("www.kangwenjun.com"));
		
		strTmp = strSite.concat("!");
		System.out.println(strTmp);
		
		char[] data = new char[10];
	}
}