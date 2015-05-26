package com.dzaitsev.codility.lesson02;

import java.util.BitSet;

/**
 * Created by dmitriyzaitsev on 5/22/15.
 * <p>Check whether array A is a permutation.
 * <p>ID: demoXRA2TW-4YM
 */
public class PermCheck {
	/**
	 * <p>A non-empty zero-indexed array A consisting of N integers is given.
	 * A permutation is a sequence containing each element from 1 to N once, and only once.
	 * <p>For example, array A such that:
	 * A[0] = 4<br>
	 * A[1] = 1<br>
	 * A[2] = 3<br>
	 * A[3] = 2<br>
	 * is a permutation, but array A such that:
	 * A[0] = 4<br>
	 * A[1] = 1<br>
	 * A[2] = 3<br>
	 * is not a permutation, because value 2 is missing.
	 * <p>The goal is to check whether array A is a permutation.
	 * <p>Write a function:
	 * class Solution { public int solution(int[] A); }
	 * that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
	 * <p>For example, given array A such that:<br>
	 * A[0] = 4<br>
	 * A[1] = 1<br>
	 * A[2] = 3<br>
	 * A[3] = 2<br>
	 * the function should return 1.
	 * Given array A such that:<br>
	 * A[0] = 4<br>
	 * A[1] = 1<br>
	 * A[2] = 3<br>
	 * the function should return 0.
	 * <p>Assume that:<ul>
	 * <li>N is an integer within the range [1..100,000];
	 * <li>each element of array A is an integer within the range [1..1,000,000,000].</ul>
	 * <p>Complexity:<ul>
	 * <li>expected worst-case time complexity is O(N);
	 * <li>expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).</ul>
	 * <p>Elements of input arrays can be modified.
	 * <p>Copyright 2009–2015 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
	 */
	public int solution(int[] A) {
		final BitSet counter = new BitSet(A.length);

		for (int a : A) {
			if (a < 1 || a > A.length || counter.get(a - 1)) {
				return 0;
			} else {
				counter.set(a - 1);
			}
		}
		return 1;
	}
}
