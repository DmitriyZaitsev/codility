package com.dzaitsev.codility.lesson01;

import com.dzaitsev.codility.TestSolution;
import org.junit.Test;

/**
 * Created by dmitriyzaitsev on 5/21/15.
 */
public class PermMissingElemTest extends TestSolution {
	@Test
	public void testSolution() throws Exception {
		final int[] A = new int[] {2, 3, 1, 5};
		assertEquals(4, new PermMissingElem().solution(A));
	}
}
