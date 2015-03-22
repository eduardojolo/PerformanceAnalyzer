package br.jolo.sort.impl;

import br.jolo.sort.ISort;

/**
 * Implementartion of the merge sort algorithm
 * 
 * Algorithm got at: http://www.vogella.com/tutorials/JavaAlgorithmsMergesort/article.html
 * 
 * @author AVELL
 *
 */
public class MergesortImpl implements ISort {
	
	 private int[] numbers;
	 private int[] helper;

	 
	 public void sort(int[] values) {
		 
		 this.numbers = values;

		 this.helper = new int[values.length];
		 mergesort(0, values.length - 1);
		 
		 System.out.println(numbers);
	 }
	 
	 private void mergesort(int low, int high) {
		 if (low < high) {
			 int middle = low + (high - low) / 2;
			 mergesort(low, middle);
			 mergesort(middle + 1, high);
			 merge(low, middle, high);
		 }
	 }
	 
	 private void merge(int low, int middle, int high) {
		 
		 for (int i = low; i <= high; i++) {
			 helper[i] = numbers[i];
		 }

		 int i = low;
		 int j = middle + 1;
		 int k = low;
		 while (i <= middle && j <= high) {
			 if (helper[i] <= helper[j]) {
				 numbers[k] = helper[i];
				 i++;
			 } else {
				 numbers[k] = helper[j];
				 j++;
			 }
			 k++;
		 }
		 while (i <= middle) {
			 numbers[k] = helper[i];
			 k++;
			 i++;
		 }
		 
	 }

}
