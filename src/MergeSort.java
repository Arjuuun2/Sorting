import java.io.*;
import java.util.Arrays;

public class MergeSort {

	//This program is to demonstrate the working of #Merge Sort
	//Uses divide and conquer strategy 
	//divide the array into two parts and sort the first part and second part using 
	//recursive method and merge it together
	public static void main(String[] args) {
		int[] arr= {4,2,3,1,7};
		
		arr=mergeSort(arr);//arguement is passed which is the parameter of the mergesort method
		System.out.println(Arrays.toString(arr));

	}
	
	static int[] mergeSort(int[] arr) {
		
		if(arr.length==1) return arr;//checking if the array length is only one
		
		int mid=arr.length/2;
		                       
		                           //note of copyofRange method
		int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));//divide the array into two parts
		int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);//this method returns merged subarrays
	}
	
	
	//merged code
	static int[] merge(int[] left, int[] right) {
		int[] mix=new int[left.length+right.length];//it is the merging array
		
		int i=0;//points to left array
		int j=0;//points to the right array
		int k=0;//points to the mix array
		
		while(i<left.length && j<right.length)//terminating condition when the left or 
			//right array will be index out of bound
		{
		if(left[i]<right[j]) {
			mix[k]=left[i]; //if the left array element is less than rigth array
			                //add it to the mix array
			i++;
		}else {
			mix[k]=right[j];
			j++;
		}
		k++;
		}
		
		//if one of the array is not complete adding the not completed part to the mix array
		
		while(i<left.length) {
			mix[k]=left[i];
			i++;
			k++;
		}
		
		while(j<right.length) {
			mix[k]=right[j];
			j++;
			k++;
		}
		
		return mix;
	}

}
