package Test;

public class constructorDemo {

	public constructorDemo() {
		System.out.println("default constructor");
	}

	public constructorDemo(int i) {
		System.out.println("single parameterized constructor");
		System.out.println(i);
	}

	public constructorDemo(int i, int j) {
		System.out.println("two parameterized constructor");
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {

		constructorDemo obj = new constructorDemo();
		constructorDemo obj1 = new constructorDemo(10);
		constructorDemo obj2 = new constructorDemo(10, 20);

	}

}
