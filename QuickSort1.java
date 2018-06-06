import java.util.Arrays;
import java.util.Random;

public class QuickSort1 {

	public static int partition(int[] a,int low,int high) {
		//int len=a.length;
		int pivot=a[high];
		int pIndex=low;
		for(int i=low;i<high;i++) {
			if(a[i]<pivot) {
				int temp=a[i];
				a[i]=a[pIndex];
				a[pIndex]=temp;
				pIndex++;
			}
		}
		a[high]=a[pIndex];
		a[pIndex]=pivot;
		return pIndex;
	}
	
	public static void quickSort(int[] a,int low,int high) {
		/*
		 * Since we are not creating new arrays in QuickSort we can't use "a.length<2"
		 * as base condition.
		 * 
		 * low=high because one element is always sorted.
		*/
		if(low>=high)
			return;
		int pIndex=partition(a,low,high);
		//System.out.println(pIndex);
		quickSort(a,low,pIndex-1);
		quickSort(a, pIndex+1,high);
	}
	
	public static void main(String[] args) {
		int[] a= new int[11];
		Random gen = new Random();
		for(int i=0;i<11;i++)
			a[i]=gen.nextInt(51);
		System.out.println(Arrays.toString(a));
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
