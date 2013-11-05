package edu.grinnell.csc207.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for the built-in sorter.
 * @author Samuel A. Rebelsky
 */
public class BuiltinSorterTest {

    @Test
    public void test1() throws Exception {
	TestUtils.test1(new BuiltinSorter<Integer>());
    } // test1
    
    @Test
    public void test2() throws Exception {
	TestUtils.test2(new BuiltinSorter<Integer>());
    } // test2

} //BuiltinSorterTest
