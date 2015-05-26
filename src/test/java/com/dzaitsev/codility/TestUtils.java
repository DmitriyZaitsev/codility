package com.dzaitsev.codility;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by dmitriyzaitsev on 5/23/15.
 */
public class TestUtils {
	/**
	 * Scans all classes accessible from the context class loader which belong to the given package and subpackages.
	 * @param packageName The base package
	 * @return The classes
	 */
	public static Class[] getTestClasses(String packageName) throws ClassNotFoundException, IOException {
		final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		assert classLoader != null;
		final String path = packageName.replace('.', '/');
		final Enumeration<URL> resources = classLoader.getResources(path);
		final List<File> dirs = new ArrayList<>();

		while (resources.hasMoreElements()) {
			final URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}

		final List<Class> classes = new ArrayList<>();
		for (File directory : dirs) {
			classes.addAll(findTestClasses(directory, packageName));
		}
		return classes.toArray(new Class[classes.size()]);
	}

	/**
	 * Recursive method used to find all classes in a given directory and subdirs.
	 * @param directory The base directory
	 * @param packageName The package name for classes found inside the base directory
	 * @return The classes
	 */
	private static List<Class> findTestClasses(File directory, String packageName) throws ClassNotFoundException {
		final List<Class> classes = new ArrayList<>();
		if (!directory.exists()) {
			return classes;
		}
		final File[] files = directory.listFiles();

		if (files != null) {
			for (File file : files) {
				final String fileName = file.getName();
				if (file.isDirectory()) {
					assert !fileName.contains(".");
					classes.addAll(findTestClasses(file, String.format("%s.%s", packageName, fileName)));
				} else if (fileName.endsWith("Test.class")) {
					classes.add(Class.forName(String.format("%s.%s", packageName, fileName.substring(0, fileName.length() - 6))));
				}
			}
		}
		return classes;
	}

	public static Class[] concat(Class[] a, Class[] b) {
		final int aLen = a.length;
		final int bLen = b.length;
		final Class[] classes = new Class[aLen + bLen];
		System.arraycopy(a, 0, classes, 0, aLen);
		System.arraycopy(b, 0, classes, aLen, bLen);
		return classes;
	}
}
