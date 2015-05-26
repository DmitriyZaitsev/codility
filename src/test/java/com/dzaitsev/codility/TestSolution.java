package com.dzaitsev.codility;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by dmitriyzaitsev on 5/21/15.
 */
public abstract class TestSolution extends Assert {
	@Rule
	public TestWatcher timeMeter = new TimeMeter();

	private static class TimeMeter extends TestWatcher {
		private static final String DIVIDER = "==================================================";
		private static final String MSG_BEFORE = "%s\n%s.%s()\nStart Time: %s";
		private static final String MSG_AFTER = "Test completed - ran in: %s sec\n%s";
		private long mTimeStart;

		@Override
		protected void starting(Description description) {
			System.out.println(String.format(MSG_BEFORE, DIVIDER, description.getTestClass().getSimpleName(), description.getMethodName(),
				new SimpleDateFormat("yyyy.MM.dd, hh:mm:ss").format(Calendar.getInstance().getTime())));
			mTimeStart = System.currentTimeMillis();
		}

		@Override
		protected void finished(Description description) {
			final double seconds = (System.currentTimeMillis() - mTimeStart) / 1000D;
			System.out.println(String.format(MSG_AFTER, new DecimalFormat("0.000").format(seconds), DIVIDER));
		}
	}
}
