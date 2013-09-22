public class RationalRootsTest {
	public static void main(String[] args) {
		// these values can be changed as necessary
		int[] pValues = { -1, -2, -4, -8, -16, -32, 1, 2, 4, 8, 16, 32 };
		int[] qValues = { -1, 1 };
		double equation;

		for (int i = 0; i < pValues.length; i++) {
			for (int j = 0; j < qValues.length; j++) {
				double x = pValues[i] / qValues[j];
				// the equation can be changed as necessary
				equation = x * x * x + 6 * (x * x) - 32;

				if (equation == 0) {
					System.out.println(pValues[i] + "/" + qValues[j]);
				}
			}
		}
	}
}
