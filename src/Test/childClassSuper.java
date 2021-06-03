package Test;

public class childClassSuper extends parentClassSuper{
	
	public childClassSuper(int age) {
		super(age);
		System.out.println("child class constructor");
	}

	public childClassSuper(int age, String name) {
		super(age,name);

	}
	public static void main(String[] args) {
		
		childClassSuper obj2 = new childClassSuper(10);
		childClassSuper obj3 = new childClassSuper(10,"Tapan");
		

	}

}
