package methodConstruction;

public class Soda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Soda soda = new Soda();

		System.out.println("I like to drink " + soda.brand + ".");
		System.out.println("I prefer to drink out of a " + soda.container + " rather than a can.");

		System.out.println("I drink " + soda.total() + " ounces a day.");
		if (!soda.healthy) {
			System.out.println("It is not a healthy drink.");
		}

		System.out.println("I should only drink " + soda.limit + " bottle a day.");

	}

}
