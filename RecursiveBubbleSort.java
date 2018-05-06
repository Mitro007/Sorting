package basics;

import java.util.Arrays;
import java.util.Random;

public class RecursiveBubbleSort {

	public static void recursiveBubbleSort(int[] a,int length) {
		if(length==1)
			return;
		for(int i=0;i<length-1;i++) {
			if(a[i]>a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		recursiveBubbleSort(a,length-1);
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
		recursiveBubbleSort(a,a.length);
		System.out.println(Arrays.toString(a));
	}
}
