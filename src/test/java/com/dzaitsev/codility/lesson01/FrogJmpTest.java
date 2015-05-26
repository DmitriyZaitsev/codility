package com.dzaitsev.codility.lesson01;

import com.dzaitsev.codility.TestSolution;
import org.junit.Test;

/**
 * Created by dmitriyzaitsev on 5/21/15.
 */
public class FrogJmpTest extends TestSolution {
	@Test
	public void testSolution() throws Exception {
		final int X = 10, Y = 85, D = 30;
		assertEquals(3, new FrogJmp().solution(X, Y, D));
	}
}
