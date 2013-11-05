package edu.grinnell.csc207.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuicksorterTest {
    @Test
    public void test1() {
	TestUtils.test1(new Quicksorter<Integer>());
    } // test1
    
    @Test
    public void test2() {
	TestUtils.test2(new Quicksorter<Integer>());
    } // test2
   /* @Test
    public void testSorti() {
	fail("Not yet implemented");
    }

    @Test
    public void testQsort() {
	fail("Not yet implemented");
    }

    @Test
    public void testPartition() {
	fail("Not yet implemented"); 
    } */
  
}
