package com.odesk.rotator;

import java.util.Arrays;

/**
 * Class responsible for providing the Rotation action for an array of integers.
 * 
 * @author Marcus Vinicius Mesquita Leite (marcusvmleite@gmail.com)
 * @since 12/16/2014
 *
 */
public class Rotation {

	/**
	 * Method responsible for rotating an array of integers 
	 * to the right (n > 0) or to the left (n < 0).
	 * @param array Array of integers to be rotated.
	 * @param n Number of positions of the rotation.
	 * @return Rotated array.
	 */
	public static int[] rotate(int[] array, int n) {
		//Check if the array is null, if has any elements and if the size of the array is
		//a multiple of the number of the positions that will be rotated.
		if (array!= null && array.length > 0 && n % array.length != 0) {
			
			//Iterate over the array to move over the positions. The Math.abs(n)
			//is necessary in case of a negative number that will rotate to the left.
			for (int i = 0; i < Math.abs(n); i++) {
				
				//STEP 1
				//If is a left rotation (n < 0), we keep the element in the first position,
				//if is a right rotation (n > 0), we keep the element in the last position.
				//We keep the element because he will be overwritten in the next step.
				int aux = array[n < 0 ? 0 : array.length - 1];
				
				//STEP 2
				//We use the System.arraycopy method to help the rotation. If is left rotation (n < 0),
				//we do a copy of the array beginning in the position = 1 to the last element, copying
				//the result to the same array beginning in the first position (0). We saved the first element,
				//so we will use this in the STEP 3.
				//Example: {1, 2, 3, 4}
				//         aux = 1, keep the first element
				//         copy {1, [2, 3, 4]} -> {[2, 3, 4], 4}
				//In the right rotation, we do a copy of the array beginning in the position (0) to last element
				//and copying to the same array beginning in the position (1).
				//Example: {1, 2, 3, 4}
				//         aux = 4, keep the last element
				//         copy {[1, 2, 3], 4} -> {1, [1, 2, 3]}
				System.arraycopy(array, n < 0 ? 1 : 0, array, n < 0 ? 0 : 1, array.length - 1);
				
				//STEP 3
				//If is a left rotation (n < 0), we put the saved element in the last position.
				//We obtain: {2, 3, 4, [1]} as the result of the left rotation.
				//If is a right rotation (n > 0), we put the saved element in the first position.
				//We obtain: {[4], 1, 2, 3} as the result of the right rotation.
				array[n < 0 ? array.length - 1 : 0] = aux;
			}
		}
	    return array;
	}
	
	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		//Some cases used in the development of the algorithm.
		System.out.println(Arrays.toString(rotate(new int[] {1,2,3,4,5,6}, 3)));
	    System.out.println(Arrays.toString(rotate(new int[] {1,2,3,4,5,6}, 19)));
	    System.out.println(Arrays.toString(rotate(new int[] {1,2,3,4,5,6}, -1)));
	    System.out.println(Arrays.toString(rotate(new int[] {1,2,3,4,5,6}, 0)));
	    System.out.println(Arrays.toString(rotate(new int[] {}, 10)));
	    System.out.println(Arrays.toString(rotate(null, 10)));
	}
	
}
