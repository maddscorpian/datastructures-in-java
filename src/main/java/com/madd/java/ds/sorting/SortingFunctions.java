package com.madd.java.ds.sorting;

import com.madd.java.util.Utility;

public class SortingFunctions {

	public int[] bubbleSort(int[] a) {
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					sorted = false;
				}
			}
		}
		return a;
	}

	public int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && current < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			// at this point we've exited, so j is either -1
			// or it's at the first element where current >= a[j]
			array[j + 1] = current;
		}
		return array;
	}

	public int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minId = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minId = j;
				}
			}
			// swapping
			int temp = array[i];
			array[i] = min;
			array[minId] = temp;
		}
		return array;
	}

	public int[] mergeSort(int[] array, int left, int right) {
		if (right <= left)
			return null;
		int mid = (left + right) / 2;
		mergeSort(array, left, mid);
		mergeSort(array, mid + 1, right);
		merge(array, left, mid, right);
		return array;
	}

	void merge(int[] array, int left, int mid, int right) {
		// calculating lengths
		int lengthLeft = mid - left + 1;
		int lengthRight = right - mid;

		// creating temporary subarrays
		int leftArray[] = new int[lengthLeft];
		int rightArray[] = new int[lengthRight];

		// copying our sorted subarrays into temporaries
		for (int i = 0; i < lengthLeft; i++)
			leftArray[i] = array[left + i];
		for (int i = 0; i < lengthRight; i++)
			rightArray[i] = array[mid + i + 1];

		// iterators containing current index of temp subarrays
		int leftIndex = 0;
		int rightIndex = 0;

		// copying from leftArray and rightArray back into array
		for (int i = left; i < right + 1; i++) {
			// if there are still uncopied elements in R and L, copy minimum of the two
			if (leftIndex < lengthLeft && rightIndex < lengthRight) {
				if (leftArray[leftIndex] < rightArray[rightIndex]) {
					array[i] = leftArray[leftIndex];
					leftIndex++;
				} else {
					array[i] = rightArray[rightIndex];
					rightIndex++;
				}
			}
			// if all the elements have been copied from rightArray, copy the rest of
			// leftArray
			else if (leftIndex < lengthLeft) {
				array[i] = leftArray[leftIndex];
				leftIndex++;
			}
			// if all the elements have been copied from leftArray, copy the rest of
			// rightArray
			else if (rightIndex < lengthRight) {
				array[i] = rightArray[rightIndex];
				rightIndex++;
			}
		}
	}
	
	
	static void heapify(int[] array, int length, int i) {
	    int leftChild = 2*i+1;
	    int rightChild = 2*i+2;
	    int largest = i;

	    // if the left child is larger than parent
	    if (leftChild < length && array[leftChild] > array[largest]) {
	        largest = leftChild;
	    }

	    // if the right child is larger than parent
	    if (rightChild < length && array[rightChild] > array[largest]) {
	        largest = rightChild;
	    }

	    // if a swap needs to occur
	    if (largest != i) {
	        int temp = array[i];
	        array[i] = array[largest];
	        array[largest] = temp;
	        heapify(array, length, largest);
	    }
	}

	public static void heapSort(int[] array) {
	    if (array.length == 0) return;

	    // Building the heap
	    int length = array.length;
	    // we're going from the first non-leaf to the root
	    for (int i = length / 2-1; i >= 0; i--)
	        heapify(array, length, i);

	    for (int i = length-1; i >= 0; i--) {
	        int temp = array[0];
	        array[0] = array[i];
	        array[i] = temp;

	        heapify(array, i, 0);
	    }
	}

	public static void main(String[] args) {
		SortingFunctions sf = new SortingFunctions();
		int[] input = { 7, 6, 5, 4, 3, 2, 1 };
		Utility.display1DArray(sf.bubbleSort(input));
		Utility.display1DArray(sf.insertionSort(input));
		Utility.display1DArray(sf.selectionSort(input));
	}

}
