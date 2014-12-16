package com.odesk.rotator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Class responsible for providing a test case to the Rotation action.
 * 
 * @author Marcus Vinicius Mesquita Leite (marcusvmleite@gmail.com)
 * @since 12/16/2014
 *
 */
public class RotationTest {

	/**
	 * Testing behavior when the array is null.
	 */
	@Test
	public void testNullArray() {
		assertNull(Rotation.rotate(null, 10));
		assertNull(Rotation.rotate(null, 0));
	}
	
	/**
	 * Testing behavior when the array is empty.
	 */
	@Test
	public void testEmptyArray() {
		assertArrayEquals(new int[] {}, Rotation.rotate(new int[] {}, 10));
		assertArrayEquals(new int[] {}, Rotation.rotate(new int[] {}, 1000));
	}
	
	/**
	 * Testing behavior when number of rotations is zero.
	 */
	@Test
	public void testEmptyNumberOfRotations() {
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, 0));
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 100}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 100}, 0));
	}
	
	/**
	 * Testing if the size of the array is multiple of the number of rotations.
	 */
	@Test
	public void testMultipleOfN() {
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, 6));
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, 12));
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, 36));
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, -6));
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, -12));
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, -36));
	}
	
	/**
	 * Testing right rotation.
	 */
	@Test
	public void testRotateRight() {
		assertArrayEquals(new int[] {6, 1, 2, 3, 4, 5}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, 1));
		assertArrayEquals(new int[] {4, 5, 6, 1, 2, 3}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, 3));
		assertArrayEquals(new int[] {6, 1, 2, 3, 4, 5}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, 7));
		assertArrayEquals(new int[] {4, 5, 6, 1, 2, 3}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, 9));
	}

	/**
	 * Testing left rotation. 
	 */
	@Test
	public void testRotateLeft() {
		assertArrayEquals(new int[] {2, 3, 4, 5, 6, 1}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, -1));
		assertArrayEquals(new int[] {4, 5, 6, 1, 2, 3}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, -3));
		assertArrayEquals(new int[] {3, 4, 5, 6, 1, 2}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, -2));
		assertArrayEquals(new int[] {5, 6, 1, 2, 3, 4}, Rotation.rotate(new int[] {1, 2, 3, 4, 5, 6}, -10));
	}
	
}
