package edu.grinnell.csc207.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sort using selection sort.
 * 
 * @author Samuel A. Rebelsky
 * @author Fiona Byrne, Kitt Nika, Justus Goldstein-Shirley
 */
public class SelectionSorter<T> extends SorterBridge<T> {
    /**
     * Sort vals using selection sort. See Sorter<T> for more details.
     * 
     * Loop invariant: All values at indices < i are smaller than the value at
     * index i and are sorted by order. All values at indices >= i are unsorted.
     */
    @Override
    public T[] sorti(T[] vals, Comparator<T> order) {
	for (int i = 0; i < vals.length; i++) {
	    Utils.swap(vals, i, indexOfSmallest(vals, order, i, vals.length));
	} // for
	return vals;
    } // sorti(T[], Comparator<T>)

    /**
     * Find the index of a smallest element in positions [lb..ub) of values.
     * 
     * @param values
     *            , the array into which we are inserting values.
     * @param order
     *            , the comparator used to determine order.
     * @param lb
     *            , the lower bound of the section to search. ub, the upper
     *            bound of the section to search.
     * 
     * @return is, the index of a smallest value
     * 
     * @pre 0 <= lb,ub <= values.length
     * @pre order can be compared to any pair of values in values.
     * @post lb <= i < ub
     * @post For all j, lb <= j < ub, order.compare(values[i], values[j]) <= 0.
     * @post values is not mutated
     * 
     *       Loop invariant: vals[is] is the smallest element in the subarray of
     *       vals[] between lb and j.
     */
    int indexOfSmallest(T[] vals, Comparator<T> order, int lb, int ub) {
	int is = lb;
	for (int j = lb + 1; j < ub; j++) {
	    if (order.compare(vals[j], vals[is]) < 0) {
		is = j;
	    }
	}
	return is;
    } // indexOfSmallest(T[], Comparator<T>, int, int)

} // SelectionSorter<T>
