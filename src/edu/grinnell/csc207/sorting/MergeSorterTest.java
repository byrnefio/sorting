package edu.grinnell.csc207.sorting;

import org.junit.Test;

/**
 * Unit tests for the merge sort.
 * 
 * @author Kitt Nika
 * @author Fiona Byrne
 * @author Justus Goldstein-Shirley
 * @author Adam Arsenault
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
