package com.dzaitsev.codility.lesson02;

import com.dzaitsev.codility.TestSolution;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dmitriyzaitsev on 5/26/15.
 */
public class MaxCounterTest extends TestSolution {

	@Test
	public void testSolution() throws Exception {
		final int[] A = new int[] {3, 4, 4, 6, 1, 4, 4};
		final int[] expected = new int[] {3, 2, 2, 4, 2};
		assertArrayEquals(expected, new MaxCounter().solution(5, A));
	}
}