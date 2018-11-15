package sorting;
import java.util.Arrays;
import java.util.Random;

public class RandomizedQuickSort {

	public static int randomizedPartition(int[]a,int low,int high) {
		Random gen = new Random();
		int pIndex = gen.nextInt(high-low+1)+low;
		a[high]=a[high]^a[pIndex]^(a[pIndex]=a[high]);
		return pivotIndex(a, low, high);
	}
	
	public static int pivotIndex(int[] a,int low,int high) {
		int pIndex=low;
		int pivot = a[high];
		for(int i=low;i<high;i++) {
			if(a[i]<=pivot) {
				a[i]=a[i]^a[pIndex]^(a[pIndex]=a[i]);
				pIndex++;
			}
		}
		a[high]=a[pIndex];
		a[pIndex]=pivot;
		return pIndex;
	}
	
	public static void quickSort(int[] a,int low,int high) {
		if(low<high) {
			int pIndex = randomizedPartition(a, low, high);
			quickSort(a, low, pIndex-1);
			quickSort(a, pIndex+1, high);
		}
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int[] input = new int[10];
		for (int i = 0; i < input.length; i++) {
			input[i]=gen.nextInt(100);
		}
		System.out.println("Array before sorting : "+ Arrays.toString(input));
		quickSort(input,0,input.length-1);
		System.out.println("Array after sorting : "+ Arrays.toString(input));	
	}
}
