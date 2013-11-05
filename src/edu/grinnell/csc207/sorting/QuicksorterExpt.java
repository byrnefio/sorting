package edu.grinnell.csc207.sorting;

public class QuicksorterExpt {
    /**
     * Run the experiments.
     */
    public static void main(String[] args) {
        Utils.iExperiments(new Quicksorter<Integer>());
        Utils.sExperiments(new Quicksorter<String>());
    } // main(String[])
}
