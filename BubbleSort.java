package basics;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static int[] bubbleSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			boolean swap=false;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swap=true;
				}
			}
			if(!swap)
				break;
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
		System.out.println(Arrays.toString(bubbleSort(a)));
	}
}
