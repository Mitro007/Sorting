import java.util.Arrays;

public class CountingSort {

	public static void countingSort(int[] a) {
		int[] count=new int[31];
		int[] result=new int[a.length];
		for(int x:a)
			count[x]++;
		System.out.println(Arrays.toString(count));
		for (int i = 1; i < count.length; i++) {
			count[i]=count[i]+count[i-1];
		}
		System.out.println(Arrays.toString(count));
		for(int x:a) {
			result[count[x]-1]=x;
			count[x]--;
		}
		System.out.println(Arrays.toString(result));
	}
	
	public static void main(String[] args) {
		int[] a= {2,27,22,8,28,1,30,8,29,28,15,16,25,28,23,16,24,23,17,11,4,2,2,22,23,8,29,16
				  ,29,26};
		System.out.println(Arrays.toString(a));
		countingSort(a);
	}
}
