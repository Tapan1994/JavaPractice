package Test;

public class finallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}

	public static void test1() {

		try {
			System.out.println("this is try block");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("this is catch block");
		} finally {
			System.out.println("this is finally block");
		}
	}
}
