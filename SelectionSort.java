package basics;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	public static int[] selectionSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minIndex])
				//finding the index of minimum element	
					minIndex=j;
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
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
		System.out.println(Arrays.toString(selectionSort(a)));
	}
}
