package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}

			System.out.println();

		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.

		printCustomMessage((s) -> {

			for (int i = s.length() - 1; i > -1; i--) {

				System.out.print(s.charAt(i));

			}

			System.out.println();
			System.out.println();
		}, "backwards");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.

		printCustomMessage((s) -> {

			Random random = new Random();

			for (int i = 0; i < s.length(); i++) {

				if (random.nextInt(2) == 0) {
					System.out.print(Character.toUpperCase(s.charAt(i)));
				} else {
					System.out.print(Character.toLowerCase(s.charAt(i)));
				}

			}

			System.out.println();
			System.out.println();

		}, "upperlowercase");

		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.

		printCustomMessage((s) -> {

			for (int i = 0; i < s.length(); i++) {

				System.out.print(s.charAt(i));
				System.out.print(".");
			}

			System.out.println();
			System.out.println();

		}, "periods");

		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.

		printCustomMessage((s) -> {

			s = s.replace("a", "");
			s = s.replace("e", "");
			s = s.replace("i", "");
			s = s.replace("o", "");
			s = s.replace("u", "");

			System.out.print(s);

			System.out.println();
			System.out.println();

		}, "onomatopoeia");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
