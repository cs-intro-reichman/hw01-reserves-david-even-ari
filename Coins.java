
public class Coins {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int quarters = (num/25);
		int cents = num-(quarters*25);

		System.out.println("Use " + quarters + " quarters and " + cents + " cents" );
	}
}