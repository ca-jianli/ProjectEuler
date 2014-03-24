package ca.jianli.projecteuler;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author Jian Li
 * 
 */
class Problem1 {
	static int solution(int N) {
		int sum = 0;
		for (int i = 3; i < N; i += 3)
			sum += i;
		for (int i = 5; i < N; i += 5)
			sum += i;
		for (int i = 15; i < N; i += 15)
			sum -= i;
		return sum;
	}

	static int solution2(int N) {
		int target = N - 1;
		return sumOfMultiple(3, target) + sumOfMultiple(5, target)
				- sumOfMultiple(15, target);
	}

	private static int sumOfMultiple(int i, int N) {
		int n = N / i;
		return n * (i * (n + 1)) / 2;
	}

	public static void main(String[] args) {
		System.out.println(solution(1000));
		System.out.println(solution2(1000));
	}
}
