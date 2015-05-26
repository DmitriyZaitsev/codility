package com.dzaitsev.codility;

import com.dzaitsev.codility.lesson01.FrogJmpTest;
import com.dzaitsev.codility.lesson01.PermMissingElemTest;
import com.dzaitsev.codility.lesson01.TapeEquilibriumTest;
import com.dzaitsev.codility.lesson02.FrogRiverOneTest;
import com.dzaitsev.codility.lesson02.MaxCounterTest;
import com.dzaitsev.codility.lesson02.MissingIntegerTest;
import com.dzaitsev.codility.lesson02.PermCheckTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Created by dmitriyzaitsev on 5/21/15.
 */
public class MainTestRunner {

	private static Class[][] sTestClasses = new Class[][] {
		new Class<?>[] { // Lesson 01
			FrogJmpTest.class,
			PermMissingElemTest.class,
			TapeEquilibriumTest.class
		},
		new Class<?>[] { // Lesson 02
			PermCheckTest.class,
			FrogRiverOneTest.class,
			MissingIntegerTest.class,
			MaxCounterTest.class
		}
	};

	public static void main(String[] args) throws Exception {
		Class[] testClasses;
		if (args.length == 0) {
			testClasses = new Class[0];

			for (final Class[] testClass : sTestClasses) {
				testClasses = TestUtils.concat(testClasses, testClass);
			}
		} else {
			testClasses = sTestClasses[Integer.parseInt(args[0])];
		}

		final Result result = JUnitCore.runClasses(testClasses);
		result.getFailures().forEach(System.out::println);
	}
}
