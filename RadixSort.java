import java.util.Arrays;

public class RadixSort {

	// to find max value of array to determine how many times radixSort has to be invoked
	public static int max(int[] a) {
		int max=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[max])
				max=i;
		}
		return a[max];
	}
	
	//sorting array elemnts based on digits
	public static void countingSortByDigits(int[] a,int exp) {
		int[] output=new int[a.length];
		
		// since digits are 0 to 9
		int[] count=new int[10];
		
		for(int x:a)
			count[(x/exp)%10]++;
		
		for(int i=1;i<10;i++)
			count[i]=count[i]+count[i-1];
		
		for(int i=a.length-1;i>=0;i--) {
			output[count[(a[i]/exp)%10]-1]=a[i];
			count[(a[i]/exp)%10]--;
		}
		for(int i=0;i<a.length;i++)
			a[i]=output[i];
	}
	
	public static void radixSort(int[] a) {
		int max=max(a);
		for(int exp=1;max/exp>0;exp*=10)
			countingSortByDigits(a, exp);
	}
	
	public static void main(String[] args) {
		int[] a= {170, 45, 75, 90, 802, 24, 2, 66};
		System.out.println(Arrays.toString(a));
		//System.out.println(max(a));
		radixSort(a);
		System.out.println(Arrays.toString(a));
	}
}
