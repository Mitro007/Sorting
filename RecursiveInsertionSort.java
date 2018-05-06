package basics;

import java.util.Arrays;
import java.util.Random;

public class RecursiveInsertionSort {

	public static void recursiveInsertionSort(int[] a,int pos) {
		//as pos starts from 1
		if(pos>a.length-1)
			return;
		int value=a[pos];
		int hole=pos;
		while(hole>0 && a[hole-1]>value) {
			a[hole]=a[hole-1];
			hole--;
		}
		a[hole]=value;
		pos++;
		recursiveInsertionSort(a, pos);
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
		recursiveInsertionSort(a,1);
		System.out.println(Arrays.toString(a));
	}
}
