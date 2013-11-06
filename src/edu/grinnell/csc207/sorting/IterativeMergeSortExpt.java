package edu.grinnell.csc207.sorting;

/**
 * A quick experiment with Quicksorter.
 * 
 * @author Kitt Nika
 * @author Fiona Byrne
 * @author Justus Goldstein-Shirley
 * @author Adam Arsenault
 */
public class IterativeMergeSortExpt {

	/**
	 * Run the experiments.
	 */
	public static void main(String[] args) {
		Utils.iExperiments(new IterativeMergeSorter<Integer>());
		Utils.sExperiments(new IterativeMergeSorter<String>());
	} // main(String[])
} // IterativeMergeSortExpt
