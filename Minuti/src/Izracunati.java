import java.util.Scanner;

public class Izracunati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesi Minute");
		Scanner input = new Scanner(System.in); double min = input.nextDouble();

		double dani = min / 60 / 24;
		double godine = dani / 365;

		System.out.println("Dani rezultat " + dani);
		System.out.println("Godine rezultat " + godine);

	}

}
