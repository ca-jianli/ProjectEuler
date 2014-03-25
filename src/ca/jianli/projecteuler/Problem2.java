package ca.jianli.projecteuler;

/**
 * Find the sum of all the even-valued terms in the Fibonacci sequence which do
 * not exceed four million.
 * 
 * @author Jian Li
 * 
 */

public class Problem2 {
	public static int solution(int N) {
		int a = 0;
		int b = 1;
		int sum = 0;
		while (true) {
			int c = a + b;
			if (c > N)
				break;
			if (c % 2 == 0)
				sum += c;
			a = b;
			b = c;
		}
		return sum;
	}

	public static int solution2(int N) {
		int a = 0;
		int b = 1;
		int sum = 0;
		int count = 2;
		while (true) {
			int c = a + b;
			if (c > N)
				break;

			if (count == 3) {
				sum += c;
				count = 0;
			}
			count++;
			a = b;
			b = c;
		}
		return sum;
	}

	// Prove even F(n) = 4*(n-3) + F(n-6)

	public static int solution3(int N) {
		int a = 2;
		int b = 8;
		int sum = 10;

		while (true) {
			int c = a + 4 * b;
			if (c > N)
				break;
			sum += c;
			a = b;
			b = c;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(solution(4000000));
		System.out.println(solution2(4000000));
		System.out.println(solution3(4000000));
	}
}
