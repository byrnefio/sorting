package edu.grinnell.csc207.sorting;

public class MergeSortExpt {
	/**
	 * Run the experiments.
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Utils.iExperiments(new MergeSorter<Integer>());
		Utils.sExperiments(new MergeSorter<String>());
	} // main(String[])
}
