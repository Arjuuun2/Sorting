import java.io.*;
import java.util.Arrays;

public class BubbleSort {
      //Simple program to demonstrate bubble sort
	//comparing two elements at a time and swap if the previous element is greater than the 
	//current element
	
	public static void main(String[] args) {
		int[] arr= {2,1,5,3,7};
		bubble(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void bubble(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {//if the previous element greater than the 
				//current element then swap the elements.
				
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];//swap
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}
