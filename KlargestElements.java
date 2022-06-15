package kLargestElements;

import java.util.PriorityQueue;

public class KlargestElements {
	
	public static int[] kLargest(int [] arr, int k)
	{
		// max heap implementation
		
		if(k>arr.length)
		{
			System.out.println("Size of k is larger than array!");
			return new int[0];
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue();
		for(int i=0;i<k;i++)
		{
			pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++)
		{
			pq.poll();
			pq.add(arr[i]);
		}
		int[] result = new int[k];
		int j=0;
		for(Integer i: pq)
		{
			result[j]=i;
			j++;
		}
		
		return result;
	}
	
	
	public static void main(String args[])
	{
		
		int arr[]= { 3,5,9,2,6,7,1,1,4,10,8 };
		int k =5;
		
		int[] klargest = new int[3];
		
		klargest = kLargest(arr,k);
		
		for(int i=0; i<klargest.length;i++)
		{
			System.out.println(klargest[i]);
		}
	}

}
