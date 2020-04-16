import java.util.Arrays;

public class Arr {
	static public void ShowArr(int[] arrNum) {
		for (int iVal : arrNum)
			System.out.println(iVal);
		System.out.println('\n');
	}
	
	static public int[] GetArr(int iEnd, int iSize) {
		int[] arrRet = new int[iSize];
		for (int i = 0; i < arrRet.length; ++i)
			arrRet[i] = iEnd--;
		
		return arrRet;
	}
	
	public static void main(String[] args) {
		int[] arrNum = GetArr(21, 5);
		ShowArr(arrNum);
		
		Arrays.sort(arrNum);
		ShowArr(arrNum);
		
		System.out.println(Arrays.binarySearch(arrNum, 18)); // 1:17 18
		System.out.println('\n');
		
		// Arrays::fill(arrNum, 3); // wrong
		Arrays.fill(arrNum, 3);
		ShowArr(arrNum);
		
		System.out.println(Arrays.binarySearch(arrNum, 18)); // -6
		System.out.println('\n');
		
		int[] arrAge = new int[arrNum.length];
		Arrays.fill(arrAge, arrNum[0]);
		System.out.println(Arrays.equals(arrNum, arrAge)); // true
		
	}
}