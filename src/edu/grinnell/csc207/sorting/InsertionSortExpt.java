package edu.grinnell.csc207.sorting;

/**
 * A quick experiment with the insertion sorter.
 *
 * @author Samuel A. Rebelsky
 */
public class InsertionSortExpt {

    /**
     * Run the experiments.
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        Utils.iExperiments(new InsertionSorter<Integer>());
        Utils.sExperiments(new InsertionSorter<String>());
    } // main(String[])
} // class InsertionSortExpt
