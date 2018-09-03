import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	
	public static int partition(int[] a,int start,int end) {
		int pivot=a[end];
		int pIndex=start;
		for(int i=start;i<end;i++) {
			if(a[i]<pivot) {
				if(pIndex!=i)
					a[i]=a[i]^a[pIndex]^(a[pIndex]=a[i]);
				pIndex++;
			}
		}
		//swap a[pIndex] and pivot
		a[end]=a[pIndex];
		a[pIndex]=pivot;
		return pIndex;
	}
	
	public static void quickSort(int[] a,int start,int end) {
		if(start < end) {
			int pIndex = partition(a, start, end);
			quickSort(a, start, pIndex-1);
			quickSort(a, pIndex+1, end);
		}
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
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
