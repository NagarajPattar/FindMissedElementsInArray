package com.myzee.array;

/*
 * Finding missing elements in a sorted array
 */
public class FindMissedElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,6,7,9,13,14,15,16,17,20,23,25};
		int maxlen = 15;
		findMissingElements(a, maxlen);
	}
	
	private static void findMissingElements(int[] a, int maxlen) {
		int i = 0, j = 1;
		while(i < a.length) {
			if(a[i] != j) {
				System.out.println(j);
				j++;
				continue;
			}
			i++;
			j++;
		}
		if(a[a.length-1] != maxlen) {
			for(int k = a[a.length-1] + 1 ; k <= maxlen; k++) {
				System.out.println(k);
			}
		}
	}
}
