package edu.grinnell.csc207.sorting;

public class QuicksorterExpt {
    /**
     * Run the experiments.
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        Utils.iExperiments(new Quicksorter<Integer>());
        Utils.sExperiments(new Quicksorter<String>());
    } // main(String[])
}
