package edu.grinnell.csc207.sorting;

import java.io.PrintWriter;

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
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
    	PrintWriter pen = new PrintWriter(System.out, true);
    	
        Utils.iExperiments(new InsertionSorter<Integer>());
        pen.println(Utils.get());
        Utils.reset();
        
        Utils.sExperiments(new InsertionSorter<String>());
        pen.println(Utils.get());
        Utils.reset();
    } // main(String[])
} // class InsertionSortExpt
