package edu.grinnell.csc207.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Sort using Quicksort.
 * 
 * @author Samuel A. Rebelsky
 * @author Kitt Nika
 * @author Fiona Byrne
 * @author Justus Goldstein-Shirley
 * @author Adam Arsenault
 */
public class Quicksorter<T> extends SorterBridge<T> {
	/**
	 * Sort vals using Quicksort. See the Sorter<T> interface for additional
	 * details.Your Name Here.
	 */
	@Override
	public T[] sorti(T[] vals, Comparator<T> order) {
		qsort(vals, order, 0, vals.length);
		return vals;
	} // sorti(T[], Comparator<T>)

	/**
	 * Sort the elements in positions [lb..ub) using Quicksort.
	 */
	public void qsort(T[] vals, Comparator<T> order, int lb, int ub) {
		// One element arrays are sorted.
		if (lb >= ub - 1) {
			return;
		} else {
			int mid = partition(vals, order, lb, ub);
			qsort(vals, order, lb, mid);
			qsort(vals, order, mid + 1, ub);
		} // More than one element
	} // sorti(T[], Comparator<T>, int, int)

	/**
	 * Pick a random pivot and reorganize the elements in positions [lb..ub) of
	 * vals such that elements smaller than the pivot appear to the left,
	 * elements bigger than the pivot appear to the right of the pivot, and the
	 * pivot is in the middle.
	 * 
	 * @param values
	 *            , an array.
	 * @param order
	 *            , a comparator.
	 * @param lb
	 *            , an integer.
	 * @param ub
	 *            , an integer.
	 * @return mid, the index of the pivot.
	 * 
	 * @pre order can be applied to any pair of elements in vals.
	 * @pre 0 <= lb < ub < values.length.
	 * @post lb <= mid < ub
	 * @post values[mid] == pivot, for some value pivot
	 * @post For all i, lb <= i < mid, order.compare(values[i],pivot) <= 0 For
	 *       all i, mid < i < ub, order.compare(pivot, values[i]) < 0
	 *  invariant: For the given pivot, all items between lb and pivot in
      	 *  the array are greater than or equal to lb and less than or equal to
      	 *  pivot, and all items between pivot and ub are greater than or equal
      	 *  to pivot and less than or equal to ub.
	 */
	int partition(T[] vals, Comparator<T> order, int lb, int ub) {
		// select pivot between lb and ub
		Random rand = new Random();
		int pivot = rand.nextInt(ub - lb) + lb;
		// indices of the small (less than pivot) and large (greater than pivot)
		// sections
		Utils.swap(vals, pivot, lb);
		int small = lb + 1;
		int large = ub - 1;

		for (int i = lb + 1; i < ub; i++) {
			System.out.println("pivot: " + pivot + " small: " + small
					+ " large: " + large);
			System.out.println("vals(" + Arrays.toString(vals) + ")");
			/*
			 * If vals[i] is not properly placed above or below pivot, keep
			 * swapping until it is.
			 */
			while ((order.compare(vals[i], vals[pivot]) <= 0) && i > pivot
					|| (order.compare(vals[i], vals[pivot]) > 0) && i < pivot) {
				/*
				 * Place vals[i] at the appropriate boundary and increment that
				 * boundary
				 */
				if (order.compare(vals[i], vals[pivot]) < 0) {
					Utils.swap(vals, i, small);
					small++;
				}

				else if (order.compare(vals[i], vals[pivot]) > 0) {
					Utils.swap(vals, i, large);
					large--;
				}
			} // while

		} // for

		// swap pivot into its place above the small elements
		Utils.swap(vals, pivot, small);
		return pivot;
	} // partition
	/*
  * int partition(T[] vals, Comparator<T> order, int lb, int ub) { // select
  * pivot between lb and ub Random rand = new Random(); int pivot =
  * rand.nextInt(ub - lb) + lb; Random rand = new Random(); int pivot =
  * rand.nextInt(ub - lb) + lb; Comparator newComp = new
  * IntegerComparator((Comparable)vals[pivot]);
  * Arrays.sort(vals,lb,ub-1,newComp); return pivot; }
  */
/*
  * int partition(T[] vals, Comparator<T> order, int lb, int ub) { // select
  * pivot between lb and ub Random rand = new Random(); int pivot =
  * rand.nextInt(ub - lb) + lb; // indices of the small (less than pivot) and
  * large (greater than pivot) // sections Utils.swap(vals, pivot, lb); int small
  * = lb; int large = ub-1; for (int i = small+1; i <= large; i++) { if
  * (order.compare(vals[i], vals[lb]) <= 0) { Utils.swap(vals, i, small);
  * small++; }
  *
  * else if (order.compare(vals[i], vals[lb]) > 0) { Utils.swap(vals, i, large);
  * large--; i--; } } // swap pivot into its place above the small elements
  * Utils.swap(vals, pivot, large); return pivot; } // partition } //
  * Quicksorter<T>
  */
} // Quicksorter<T>
