package basics;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

	public static int[] insertionSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int value=a[i];
			int hole=i;
			while(hole>0 && a[hole-1]>value) {
				a[hole]=a[hole-1];
				hole--;
			}
			a[hole]=value;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int[] a = new int[10];
		for(int i=0;i<a.length;i++) {
			int input=gen.nextInt(100);
			a[i]=input;
		}
		System.out.println("Before Sorting :");
		System.out.println(Arrays.toString(a));
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(insertionSort(a)));
	}
}
