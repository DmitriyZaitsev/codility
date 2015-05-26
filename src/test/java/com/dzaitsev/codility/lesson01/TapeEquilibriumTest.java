package com.dzaitsev.codility.lesson01;

import com.dzaitsev.codility.TestSolution;
import org.junit.Test;

/**
 * Created by dmitriyzaitsev on 5/22/15.
 */
public class TapeEquilibriumTest extends TestSolution {
	@Test
	public void testSolution() throws Exception {
		final int[] A = new int[] {3, 1, 2, 4, 3};
		assertEquals(1, new TapeEquilibrium().solution(A));
	}
}
