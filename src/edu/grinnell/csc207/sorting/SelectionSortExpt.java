package edu.grinnell.csc207.sorting;

import java.io.PrintWriter;

/**
 * A quick experiment with the selection sorter.
 *
 * @author Samuel A. Rebelsky
 * @author Kitt Nika
 * @author Fiona Byrne
 * @author Justus Goldstein-Shirley
 * @author Adam Arsenault
 */
public class SelectionSortExpt {

    /**
     * Run the experiments.
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
    	PrintWriter pen = new PrintWriter(System.out, true);
    	
        Utils.iExperiments(new SelectionSorter<Integer>());
        pen.println(Utils.get());
        Utils.reset();
        
        Utils.sExperiments(new SelectionSorter<String>());
        pen.println(Utils.get());
        Utils.reset();
    } // main(String[])
} // class SelectionSortExpt
