package br.jolo.sort.impl;

import br.jolo.sort.ISort;

/**
 * Implementation of the the quicksort algorithm
 * 
 * Algorithm got at: http://www.vogella.com/tutorials/JavaAlgorithmsQuicksort/article.html
 * 
 * @author Eduardo Jolo
 *
 */
public class QuicksortImpl implements ISort {

	private int[] numbers;

	public void sort(int[] values) {
		
		this.numbers = values;
		
		quicksort(0, values.length - 1);
		
	}
	
	/**
	 * Implementation of the quicksort strategy 
	 * 
	 * @param low Lowest position to be considered
	 * @param high Highest position to be considered
	 */
	private void quicksort(int low, int high) {
		
	    int i = low, j = high;
	    int pivot = numbers[low + (high-low)/2];

	    while (i <= j) {
	      while (numbers[i] < pivot) {
	        i++;
	      }
	      while (numbers[j] > pivot) {
	        j--;
	      }

	      if (i <= j) {
	        exchange(i, j);
	        i++;
	        j--;
	      }
	    }
	    if (low < j)
	      quicksort(low, j);
	    if (i < high)
	      quicksort(i, high);
	  }
	
	/**
	 * Exchange the position of two elements in the array
	 * 
	 * @param i First element position
	 * @param j Second element position
	 */
	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

}
