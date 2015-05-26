package com.dzaitsev.codility.lesson02;

import com.dzaitsev.codility.TestSolution;
import org.junit.Test;


/**
 * Created by dmitriyzaitsev on 5/22/15.
 */
public class PermCheckTest extends TestSolution {

	@Test
	public void testSolution() throws Exception {
		final PermCheck permCheck = new PermCheck();
		final int[] A1 = {4, 1, 3, 2};
		final int[] A2 = {4, 1, 3};
		assertEquals(1, permCheck.solution(A1));
		assertEquals(0, permCheck.solution(A2));
	}
}