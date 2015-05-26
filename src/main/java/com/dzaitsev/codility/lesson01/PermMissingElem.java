package com.dzaitsev.codility.lesson01;

/**
 * Created by dmitriyzaitsev on 5/21/15.
 * <br>Find the missing element in a given permutation.
 * <br>ID: demo2PXE96-Z2Z
 */
public class PermMissingElem {
	/**
	 * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that
	 * <br>exactly one element is missing.
	 * <br>Your goal is to find that missing element.
	 * <br>Write a function:
	 * <br>class Solution { public int solution(int[] A); }
	 * <br>that, given a zero-indexed array A, returns the value of the missing element.
	 * <br>For example, given array A such that:
	 * <br>A[0] = 2
	 * <br>A[1] = 3
	 * <br>A[2] = 1
	 * <br>A[3] = 5
	 * <br>the function should return 4, as it is the missing element.
	 * <br>Assume that:
	 * <br>N is an integer within the range [0..100,000];
	 * <br>the elements of A are all distinct;
	 * <br>each element of array A is an integer within the range [1..(N + 1)].
	 * <br>Complexity:
	 * <br>expected worst-case time complexity is O(N);
	 * <br>expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
	 * <br>Elements of input arrays can be modified.
	 * <br>Copyright 2009–2015 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
	 */
	public int solution(int[] A) {
		final int[] B = new int[A.length + 1];

		for (int a : A) {
			B[a - 1] = 1;
		}

		for (int i = 0; i < B.length; i++) {
			if (B[i] == 0) {
				return i + 1;
			}
		}
		return 0;
	}
}
