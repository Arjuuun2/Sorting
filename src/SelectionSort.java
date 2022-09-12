import java.io.*;
import java.util.Arrays;


public class SelectionSort {
               //Program to demonstrate Selection sort in java
	//comparing one element with all the element in the array within a for loop
	
	public static void main(String[] args) {
		int[] arr= {3,2,5,1,7};
		selection(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void selection(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
