package edu.grinnell.csc207.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sort using iterative merge sort.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here.
 */
public class IterativeMergeSorter<T> extends SorterBridge<T> {
    /**
     * Sort vals using iterative merge sort. See the Sorter<T> interface for
     * additional details.
     * 
     * Loop invariant:
     */
    @Override
    public T[] sorti(T[] vals, Comparator<T> order) {
	// STUB
	int size = 1;
	T[] temp = (T[]) new Object[vals.length];
	while (size < vals.length) {
	    // Merge neighboring subarrays of size size
	    for (int i = 0; i < vals.length -  size; i += size * 2) {
		T[] subarray1 = Arrays.copyOfRange(vals, i, i + size);
		T[] subarray2 = Arrays.copyOfRange(vals, i + size, i + size
			+ size);
		temp = Utils.merge(order, subarray1, subarray2);
		for (int j = i; j < i + size+size; j++) {
		    vals[j] = temp[j];
		}	    }
	    // FILL IN!
	    // The merged subarrays are now twice as large
	    size *= 2;
	} // while
	return vals;
    } // sorti(T[], Comparator<T>)
} // IterativeMergeSorter<T>
