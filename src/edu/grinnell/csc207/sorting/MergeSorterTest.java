package edu.grinnell.csc207.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Some simple tests of our Merge sort routine.
 */
public class MergeSorterTest {
	@Test
	public void test1() throws Exception {
		TestUtils.test1(new MergeSorter<Integer>());
	} // test1

	@Test
	public void test2() throws Exception {
		TestUtils.test2(new MergeSorter<Integer>());
	} // test2

} // MergeSorterTest
