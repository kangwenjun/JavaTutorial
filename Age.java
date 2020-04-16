import num;

public class Age {
	int m_iAge;
	public void setAge(int age) {
		m_iAge = age;
	}
	
	public int getAge() {
		return m_iAge;
	}
	
	public static void main(String[] args) {
		Age age = new Age();
		age.setAge(23);
		System.out.println(age.getAge());
	}
}