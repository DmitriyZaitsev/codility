package com.dzaitsev.codility.lesson02;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by dmitriyzaitsev on 5/25/15.
 */
public class MissingInteger {
	public int solution(int[] A) {
		final int size = A.length;
		final boolean[] buffer = new boolean[size + 1];
		int max = 1;

		//populate bitmap and also find highest positive int in input list.
		for (final int a : A) {
			if (a > 0 && a <= size) {
				buffer[a] = true;
			}

			if (a > max) {
				max = a;
			}
		}

		//find the first positive number in bitmap that is false.
		for (int i = 1; i < buffer.length; i++) {
			if (!buffer[i]) {
				return i;
			}
		}

		//this is to handle the case when input array is not missing any element.
		return max + 1;
	}

	public int solution2(int[] A) {
		A = IntStream.of(A)
			.filter(x -> x > 0)
			.distinct()
			.sorted()
			.toArray();

		int min = 1;
		for (int val : A) {
			if (val == min) {
				min++;
			} else {
				return min;
			}
		}
		return min;
	}

	public int solution3(int[] A) {
		int min = 1;
		Arrays.sort(A);

		for (int a : A) {
			if (a > -1 && a == min) {
				min++;
			}
		}

		return min;

	}
}
