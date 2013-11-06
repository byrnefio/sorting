package edu.grinnell.csc207.sorting;

import java.io.PrintWriter;

/**
 * A quick experiment with Quicksorter.
 * 
 * @author Kitt Nika
 * @author Fiona Byrne
 * @author Justus Goldstein-Shirley
 * @author Adam Arsenault
 */
public class QuicksorterExpt {

	/**
	 * Run the experiments.
	 * 
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		PrintWriter pen = new PrintWriter(System.out, true);

		Utils.iExperiments(new Quicksorter<Integer>());
		pen.println(Utils.get());
		Utils.reset();

		Utils.sExperiments(new Quicksorter<String>());
		pen.println(Utils.get());
		Utils.reset();
	} // main(String[])
} // QuicksorterExpt
