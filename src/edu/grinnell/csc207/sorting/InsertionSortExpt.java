package edu.grinnell.csc207.sorting;

/**
 * A quick experiment with the insertion sorter.
 *
 * @author Samuel A. Rebelsky
 * @author Kitt Nika
 * @author Fiona Byrne
 * @author Justus Goldstein-Shirley
 * @author Adam Arsenault
 */
public class InsertionSortExpt {

    /**
     * Run the experiments.
     */
    public static void main(String[] args) {
        Utils.iExperiments(new InsertionSorter<Integer>());        
        Utils.sExperiments(new InsertionSorter<String>());
    } // main(String[])
} // class InsertionSortExpt
