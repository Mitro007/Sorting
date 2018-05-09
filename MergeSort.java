package basics;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static int[] merge(int[] left,int[] right) {
		int[] result=new int[left.length+right.length];
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				result[k]=left[i];
				i++;
			} else {
				result[k]=right[j];
				j++;
			}
			k++;	
		}
		while(i<left.length) {
			result[k]=left[i];
			k++;
			i++;
		}
		while(j<right.length) {
			result[k]=right[j];
			k++;
			j++;
		}
		return result;
	}
	
	public static int[] mergeSort(int[] a) {
		if(a.length<2)
			return a;
		int mid=a.length/2;
		int i=0;
		// left sub array
		int[] left=new int[mid];
		for(i=0;i<mid;i++)
			left[i]=a[i];
		//right sub array
		int[] right=new int[a.length-mid];
		for(;i<a.length;i++)
			right[i-mid]=a[i];
		left=mergeSort(left);
		right=mergeSort(right);
		a=merge(left, right);
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
		System.out.println(Arrays.toString(mergeSort(a)));
	}
}
