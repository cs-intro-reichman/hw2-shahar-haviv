// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		Double javaPhi = Math.PI;
		int numberOfIterations = Integer.parseInt(args[0]);
		int deviser = 3;
		double calcPhi = 1;
		for (int i = 3; i < (numberOfIterations + 2); i++) {
			if (i % 2 == 1) {
				calcPhi = calcPhi - (1.0 / deviser);
			} else {
				calcPhi = calcPhi + (1.0 / deviser);
			}
			deviser = deviser + 2;
		}
		calcPhi = calcPhi * 4;
		System.out.println("pi according to Java: " + javaPhi);
		System.out.println("pi, approximated:     " + calcPhi);
	}
}
