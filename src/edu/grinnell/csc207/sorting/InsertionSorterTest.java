package edu.grinnell.csc207.sorting;

import org.junit.Test;

/**
 * Unit tests for the insertion sorter.
 * 
 * @author Kitt Nika
 * @author Fiona Byrne
 * @author Justus Goldstein-Shirley
 * @author Adam Arsenault
 */
public class InsertionSorterTest {

	@Test
	public void test1() throws Exception {
		TestUtils.test1(new InsertionSorter<Integer>());
	} // test1

	@Test
	public void test2() throws Exception {
		TestUtils.test2(new InsertionSorter<Integer>());
	} // test2

} // InsertionSorterTest
