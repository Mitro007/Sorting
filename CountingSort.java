package sorting;

import java.util.Arrays;
import java.util.Random;

public class CountingSort {

	public static int maxElement(int[] a) {
		int max = 0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[max])
				max=i;
		}
		return a[max];
	}
	
	public static int minElement(int[] a) {
		int min = 0;
		for(int i=1;i<a.length;i++) {
			if(a[i] < a[min])
				min=i;
		}
		return a[min];
	}
	
	// written by me
	/*public static int[] countingSort(int[] a) {
		int count[] = new int[maxElement(a)+1];
		int[] output = new int[a.length];
		for(int x:a)
			count[x]++;
		//System.out.println(Arrays.toString(count));
		int minIndex = minElement(a);
		int maxIndex = maxElement(a);
		int k=0;
		for(int i=minIndex;i<=maxIndex;i++) {
			while(count[i] > 0) {
				output[k++]=i;
				count[i]--;
			}
		}
		return output;
	}*/
	
	// actual implementation
	public static int[] countingSort(int[] a) {
		int[] count = new int[maxElement(a)+1];
		int[] output = new int[a.length];
		for(int x:a)
			count[x]++;
		for(int i=1;i<count.length;i++)
			count[i]=count[i]+count[i-1];
		for(int x:a) {
			int index = count[x];
			output[--index]=x;
			count[x]--;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int[] input = new int[10];
		for (int i = 0; i < input.length; i++) {
			input[i]=gen.nextInt(100);
		}
		System.out.println("Array before sorting : "+ Arrays.toString(input));
		//System.out.println(maxElement(input));
		//System.out.println(minElement(input));
		System.out.println("Array after sorting : "+ Arrays.toString(countingSort(input)));
		
	}
}
