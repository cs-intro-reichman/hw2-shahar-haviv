// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		Integer number = Integer.parseInt(args[0]);
		String isVerbose = args[1];
		if (isVerbose == "v") {
			for (Integer i = 1; i <= number; i++) {
				collatzRecursion(1, i, 0);
				System.out.println("");
			}
		} else {
			System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
		}
	}

	private static void collatzRecursion(Integer initialRun, Integer number, Integer cyceleNum) {
		if (initialRun == 1) {
			if (number % 2 == 1) {
				System.out.print(number + " ");
				number = number * 3;
				number = number + 1;
				cyceleNum = cyceleNum + 1;
				collatzRecursion(0, number, cyceleNum);
			} else {
				System.out.print(number + " ");
				number = number / 2;
				cyceleNum = cyceleNum + 1;
				collatzRecursion(0, number, cyceleNum);
			}
		} else {
			if (number == 1) {
				System.out.print(number + " ");
				cyceleNum = cyceleNum + 1;
				System.out.print("(" + cyceleNum + ")");
			} else if (number % 2 == 0) {
				System.out.print(number + " ");
				number = number / 2;
				cyceleNum = cyceleNum + 1;
				collatzRecursion(initialRun, number, cyceleNum);
			} else {
				System.out.print(number + " ");
				number = number * 3;
				number = number + 1;
				cyceleNum = cyceleNum + 1;
				collatzRecursion(initialRun, number, cyceleNum);
			}
		}

	}

	private static void collatzRecursionQuiet(Integer initialRun, Integer number, Integer cyceleNum) {
		if (initialRun == 1) {
			if (number % 2 == 1) {
				number = number * 3;
				number = number + 1;
				cyceleNum = cyceleNum + 1;
				collatzRecursion(0, number, cyceleNum);
			} else {
				number = number / 2;
				cyceleNum = cyceleNum + 1;
				collatzRecursion(0, number, cyceleNum);
			}
		} else {
			if (number == 1) {
				cyceleNum = cyceleNum + 1;
			} else if (number % 2 == 0) {
				number = number / 2;
				cyceleNum = cyceleNum + 1;
				collatzRecursion(initialRun, number, cyceleNum);
			} else {
				number = number * 3;
				number = number + 1;
				cyceleNum = cyceleNum + 1;
				collatzRecursion(initialRun, number, cyceleNum);
			}
		}

	}
}
