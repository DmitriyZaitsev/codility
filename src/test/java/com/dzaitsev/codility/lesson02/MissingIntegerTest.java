package com.dzaitsev.codility.lesson02;

import com.dzaitsev.codility.TestSolution;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Created by dmitriyzaitsev on 5/25/15.
 */
public class MissingIntegerTest extends TestSolution {
	private int[] A1;
	private int[] A2;

	@Before
	public void setUp() throws Exception {
		final Random random = new Random(System.currentTimeMillis());
		final int N = 100_000;

		A1 = new int[N];
		for (int i = 0; i < N; i++) {
			//A1[i] = random.nextInt(Integer.MAX_VALUE) - (i % 2 == 0 ? 0 : Integer.MAX_VALUE);
			A1[i] = i + 1;
		}
	}

	@Test(timeout = 1500)
	public void testSolution1() throws Exception {
		final int solution1 = new MissingInteger().solution(A1);
		assertTrue(solution1 > 0);
	}

	@Test(timeout = 1500)
	public void testSolution2() throws Exception {
		final int solution2 = new MissingInteger().solution2(A1);
		assertTrue(solution2 > 0);
	}

	@Test(timeout = 1500)
	public void testSolution3() throws Exception {
		final int solution3 = new MissingInteger().solution3(A1);
		assertTrue(solution3 > 0);
	}
}