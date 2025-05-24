public class summationAlgorithm {
	public static int computeSum(int a, int b) {
		if(a > b || a == b) {
			throw new ArithmeticException("a is greater than or equal to b");
		}

		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(computeSum(1, 4));
		System.out.println(computeSum(6, 22));
		System.out.println(computeSum(15, 16));

		// for example, if uncommented, both of these would throw errors for not following the logic of a < b
			// System.out.println(computeSum(4, 4));
			// System.out.println(computeSum(2, 1));
	}
}