public class summationAlgorithm {
	public static int computeSum(int a, int b) {
		if(a > b || a == b) {
			throw new ArithmeticException("a is greater than or equal to b");
		}

		// O(n) complexity implementation:
			// int sum = 0;
			// for(int i = a; i <= b; i++) {
			// 	sum += i;
			// }
			// return sum;

		// using a summation formula, the time complexity is O(1). in my original implementation, I used the commented-out for loop above, which has a time complexity of O(n) as its complexity increases along with the size of the distance between a and b. using the summation formula below, the time complexity becomes O(1) as the same formula must be calculated on the dataset, regardless of its size
		return (b*(b+1)/2) - (a*(a-1)/2);
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