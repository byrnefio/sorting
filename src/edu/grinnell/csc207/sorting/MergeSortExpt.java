package edu.grinnell.csc207.sorting;

public class MergeSortExpt {
    /**
     * Run the experiments.
     */
    public static void main(String[] args) {
	Utils.iExperiments(new MergeSorter<Integer>());
	Utils.sExperiments(new MergeSorter<String>());
    } // main(String[])
}
