package edu.grinnell.csc207.sorting;

/**
 * A quick experiment with the built-in sorter.
 *
 * @author Samuel A. Rebelsky
 */
public class BuiltinSortExpt {
	
    /**
     * Run the experiments.
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        Utils.iExperiments(new BuiltinSorter<Integer>());
        Utils.sExperiments(new BuiltinSorter<String>());
    } // main(String[])
} // class BuiltinSortExpt
