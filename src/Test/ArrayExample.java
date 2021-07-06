package Test;

public class ArrayExample {

	public static void main(String[] args) {

		int i[] = new int[4];

		i[0] = 20;
		i[1] = 1;
		i[2] = 20;
		i[3] = 10;

		System.out.println(i[1]);
		for (int k: i) {
			System.out.println(k);
		}

	}

}
