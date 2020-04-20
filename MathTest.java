
public class MathTest {
	public static void main(String[] args) {
		System.out.println("sin(PI/2): " + Math.sin(Math.PI/2));
		System.out.println("cos(0): " + Math.cos(0));
		System.out.println("tan(PI/3): " + Math.tan(Math.PI/3));
		System.out.println("atan(1): " + Math.atan(1));
		System.out.println("PI/2 degrees: " + Math.toDegrees(Math.PI/2));
		System.out.println("random: " + Math.random());
		
		int index = 0;
		double[] nums = {1.4, 1.4, 1.4, 1.5};
		System.out.println("floor(1.4) " + Math.floor(nums[index++]));
		System.out.println("round(1.4) " + Math.round(nums[index++]));
		System.out.println("ceil(1.4) " + Math.ceil(nums[index++]));
		System.out.println("round(1.5) " + Math.round(nums[index++]));
	}
}