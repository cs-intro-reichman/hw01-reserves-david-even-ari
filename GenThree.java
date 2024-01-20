/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c1 = (int)((double)(b-a) * (Math.random())) + 10;
		int c2 = (int)((double)(b-a) * (Math.random())) + 10;
		int c3 = (int)((double)(b-a) * (Math.random())) + 10;

	
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		int minimal = Math.min(c1, Math.min(c2, c3));
		System.out.println("The minimal generated number was " + minimal);


	}
}
