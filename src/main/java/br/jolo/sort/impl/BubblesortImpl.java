package br.jolo.sort.impl;

import br.jolo.sort.ISort;

/**
 * Implementation of the bubble sort algorithm
 * 
 * Algorithm got at: http://stackoverflow.com/questions/11644858/bubblesort-implementation
 * 
 * @author Eduardo Jolo
 *
 */
public class BubblesortImpl implements ISort {

	public void sort(int[] array) {
		
		boolean swap = true;
	    int temp;
	    
		while(swap){
		    swap = false;
		    for(int i = 0;i<array.length-1;i++){
		
		        if(array[i] > array[i+1]){
		            temp = array[i];
		            array[i] = array[i+1];
		            array[i+1] = temp;                   
		            swap = true;
		        }
		    }
		}
				
	}
	
}
