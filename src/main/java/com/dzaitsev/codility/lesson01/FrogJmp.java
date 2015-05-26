package com.dzaitsev.codility.lesson01;

/**
 * <p>Created by dmitriyzaitsev on 5/21/15.
 * <p>Count minimal number of jumps from position X to Y.
 * <p>ID: demo5VU2ZQ-PWQ
 */
public class FrogJmp {
	/**
	 * <p>A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position
	 * greater than or equal to Y. The small frog always jumps a fixed distance, D.
	 * <p>Count the minimal number of jumps that the small frog must perform to reach its target.
	 * <p>Write a function:
	 * <br>class Solution { public int solution(int X, int Y, int D); }
	 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
	 * For example, given:<br>
	 * X = 10<br>
	 * Y = 85<br>
	 * D = 30<br>
	 * the function should return 3, because the frog will be positioned as follows:<ul>
	 * <li>after the first jump, at position 10 + 30 = 40
	 * <li>after the second jump, at position 10 + 30 + 30 = 70
	 * <li>after the third jump, at position 10 + 30 + 30 + 30 = 100</ul>
	 * <p>Assume that:
	 * X, Y and D are integers within the range [1..1,000,000,000];<br>
	 * X ≤ Y.
	 * <p>Complexity:<ul>
	 * <li> expected worst-case time complexity is O(1);
	 * <li> expected worst-case space complexity is O(1).</ul>
	 * <p> Copyright 2009–2015 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
	 */
	public int solution(int X, int Y, int D) {
		int dist = Y - X;
		return dist % D == 0 ? dist / D : dist / D + 1;
	}
}
