package ca.jianli.projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author Jian Li
 * 
 */
public class Problem3 {
	public static int solution(long N) {
		ArrayList<Integer> candidates = findPrimes((int) Math.sqrt(N));
		for (int i = candidates.size() - 1; i >= 0; --i) {
			if (N % candidates.get(i) == 0)
				return candidates.get(i);
		}
		return -1;
	}

	// Find all primes < N using a sieve
	public static ArrayList<Integer> findPrimes(int N) {
		if (N <= 1)
			return new ArrayList<Integer>();

		boolean[] primes = new boolean[N + 1];
		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;
		for (int i = 2; i * i <= N; i++)
			if (primes[i])
				for (int k = i * i; k <= N; k += i)
					primes[k] = false;

		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < N + 1; i++)
			if (primes[i])
				res.add(i);
		return res;
	}

	public static void main(String[] args) {
		System.out.println(solution(600851475143L));
	}
}
