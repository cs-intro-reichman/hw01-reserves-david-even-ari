
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c1 = (int)((double)(b-a) * (Math.random())) + a;
		int c2 = (int)((double)(b-a) * (Math.random())) + a;
		int c3 = (int)((double)(b-a) * (Math.random())) + a;

	
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		int minimal = Math.min(c1, Math.min(c2, c3));
		System.out.println("The minimal generated number was " + minimal);


	}
}
