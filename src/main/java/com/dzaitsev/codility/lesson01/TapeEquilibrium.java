package com.dzaitsev.codility.lesson01;

/**
 * Created by dmitriyzaitsev on 5/21/15.
 * <br>Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 * <br>ID: demoU2X4VM-NJT
 */
public class TapeEquilibrium {
	/**
	 * <br>A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
	 * <br>Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
	 * <br>The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
	 * <br>In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
	 * <br>For example, consider array A such that:
	 * <br>A[0] = 3
	 * <br>A[1] = 1
	 * <br>A[2] = 2
	 * <br>A[3] = 4
	 * <br>A[4] = 3
	 * <br>We can split this tape in four places:
	 * <br>P = 1, difference = |3 − 10| = 7
	 * <br>P = 2, difference = |4 − 9| = 5
	 * <br>P = 3, difference = |6 − 7| = 1
	 * <br>P = 4, difference = |10 − 3| = 7
	 * <br>Write a function:
	 * <br>class Solution { public int solution(int[] A); }
	 * <br>that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
	 * <br>For example, given:
	 * <br>A[0] = 3
	 * <br>A[1] = 1
	 * <br>A[2] = 2
	 * <br>A[3] = 4
	 * <br>A[4] = 3
	 * <br>the function should return 1, as explained above.
	 * <br>Assume that:
	 * <br>N is an integer within the range [2..100,000];
	 * <br>each element of array A is an integer within the range [−1,000..1,000].
	 * <br>Complexity:
	 * <br>expected worst-case time complexity is O(N);
	 * <br>expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
	 * <br>Elements of input arrays can be modified.
	 * <br>Copyright 2009–2015 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
	 */
	public int solution(int[] A) {
		int sumLeft = A[0];
		int sumRight = 0;

		for (int i = 1; i < A.length; i++) {
			sumRight += A[i];
		}

		int min = Math.abs(sumLeft - sumRight);

		for (int P = 1; P < A.length - 1; P++) {
			sumLeft += A[P];
			sumRight -= A[P];
			min = Math.min(min, Math.abs(sumLeft - sumRight));
		}
		return min;
	}
}
