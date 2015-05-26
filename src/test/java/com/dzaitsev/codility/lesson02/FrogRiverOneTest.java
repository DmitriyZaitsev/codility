package com.dzaitsev.codility.lesson02;

import com.dzaitsev.codility.TestSolution;
import org.junit.Test;

/**
 * Created by dmitriyzaitsev on 5/25/15.
 */
public class FrogRiverOneTest extends TestSolution {

	@Test
	public void testSolution() throws Exception {
		final int[] A = new int[] {1, 3, 1, 4, 2, 3, 5, 4};
		final FrogRiverOne frogRiverOne = new FrogRiverOne();
		assertEquals(6, frogRiverOne.solution(5, A));
		assertEquals(6, frogRiverOne.solution2(5, A));
	}
}