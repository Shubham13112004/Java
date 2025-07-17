package array.practice;
import java.util.*;


public class Arrays_ArrayList {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println("Before Swapping"+Arrays.toString(arr));
		swap(arr,1,3);

	}
	
	static void swap(int[] arr,int idx1,int idx2 ) {
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
		
		System.out.println("After Swapping "+ Arrays.toString(arr));
	}

}
