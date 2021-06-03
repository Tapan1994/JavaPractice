package Test;

public class IfElseConcept {

	public static void main(String[] args) {

		int a = 21, b = 10;

		if (b > a) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("a is greater than b");
		}
		//comparasion operator 
		// < > <= >= == !=
		
		int c=25,d=25;
		
		if (c==d) {
			System.out.println("c and d are equal");
				}
		else {
			System.out.println("c and d are not equal");
		}
		
		
		int i=100, j=200,k=300;
		
		if (i>k & i>j) {
			System.out.println("i is greatest");
		}
		
		else if(j>k) {
			System.out.println("j is greatest");
		}
		
		else{
			System.out.println("k is greatest");
		}
		
		
		
		
		
		
		
	
	}
}
