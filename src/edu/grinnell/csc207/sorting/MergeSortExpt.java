package edu.grinnell.csc207.sorting;

/**
 * A quick experiment with Quicksorter.
 * 
 * @author Kitt Nika
 * @author Fiona Byrne
 * @author Justus Goldstein-Shirley
 * @author Adam Arsenault
 */
public class MergeSortExpt {
	
	/**
	 * Run the experiments.
	 */
	public static void main(String[] args) {
		Utils.iExperiments(new MergeSorter<Integer>());
		Utils.sExperiments(new MergeSorter<String>());
	} // main(String[])
} // MergeSortExpt
