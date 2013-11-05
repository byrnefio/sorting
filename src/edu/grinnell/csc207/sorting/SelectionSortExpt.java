package edu.grinnell.csc207.sorting;

/**
 * A quick experiment with the selection sorter.
 *
 * @author Samuel A. Rebelsky
 */
public class SelectionSortExpt {

    /**
     * Run the experiments.
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        Utils.iExperiments(new SelectionSorter<Integer>());
        Utils.sExperiments(new SelectionSorter<String>());
    } // main(String[])
} // class SelectionSortExpt
