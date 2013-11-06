package edu.grinnell.csc207.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sort using iterative merge sort.
 * 
 * @author Samuel A. Rebelsky
 * @author Kitt Nika
 * @author Fiona Byrne
 * @author Justus Goldstein-Shirley
 * @author Adam Arsenault
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
		int size = 1;

		while (size / 2 < vals.length) {
			/* Merge neighboring subarrays of size size */

			// until we reach the last subarray of size size...
			for (int i = 0; i < vals.length; i += size * 2) {
				// create the first subarray of up to size size
				T[] subarray1, subarray2, subtemp;

				if (vals.length >= i + size) {
					subarray1 = Arrays.copyOfRange(vals, i, i + size);
				} else {
					subarray1 = Arrays.copyOfRange(vals, i, vals.length);
				}
				// if possible, create the second subarray of size size
				if (vals.length >= i + (2 * size)) {
					subarray2 = Arrays.copyOfRange(vals, i + size, i
							+ (2 * size));
					// and merge those two subarrays
					subtemp = Utils.merge(order, subarray1, subarray2);
				} else if (vals.length >= i + size) {
					subarray2 = Arrays.copyOfRange(vals, i + size, vals.length);
					subtemp = Utils.merge(order, subarray1, subarray2);
				} else {
					subtemp = subarray1;
				}
				// change the appropriate size * 2 values in the original array
				// to the merged array
				for (int j = 0; j < subtemp.length; j++) {
					vals[j + i] = subtemp[j];
				}
			}
			// Double the size of the subarrays to be merged
			size *= 2;
		} // while
		return vals;
	} // sorti(T[], Comparator<T>)
} // IterativeMergeSorter<T>