package br.jolo.util;

/**
 * Utility class
 * 
 * @author Eduardo Jolo
 *
 */
public class Util {

	/**
	 * Private constructor for utility class
	 */
	private Util() {
	}
	
	/**
	 * Fill an array of integers with the number of elements requestes
	 * @param numElements Number of elements
	 * 
	 * @return int[]
	 */
	public static int[] fillArray(int numElements) {
        int[] array = new int[numElements];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(1 + Math.random() * (numElements+1));
        }
        
        return array;
    }
	
	/**
	 * Print the elements of the given array
	 * 
	 * @param array Array of integers
	 */
	public static void printArray(int[] array) {
		
		for(int i= 0 ; i < array.length; i++) {
			
			System.out.print(array[i]);
			
			if(i+1 < array.length) {
				System.out.print(", ");
			} else {
				System.out.println("");
			}
		}
	}
}
