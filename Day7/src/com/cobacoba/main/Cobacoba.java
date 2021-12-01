package com.cobacoba.main;
import java.util.Arrays;
import java.util.Scanner;

public class Cobacoba {	  
	class GFG {
	  
	    // Function to add x in arr
	    public static int[] main(int n, int arr[], int x)
	    {
	        int i;
	  
	        // create a new array of size n+1
	        int newarr[] = new int[n + 1];
	  
	        // insert the elements from
	        // the old array into the new array
	        // insert all elements till n
	        // then insert x at n+1
	        for (i = 0; i < n; i++)
	            newarr[i] = arr[i];
	  
	        newarr[n] = x;
	  
	        return newarr;
	    }
	    public static int[] main2(int n, int arr[])
	    {
	        int i;
	  
	        int oldarr[] = new int[n];
	        
	        for (i = 0; i < n; i++)
	            oldarr[i] = arr[i];
	        
	        return oldarr;
	    }
	    public static int[] main3(int n, int arr[])
	    {
	        int i;
	  
	        int oldarr[] = new int[n];
	        
	        for (i = 0; i < n; i++)
	            oldarr[i] = arr[i];
	        
	        return oldarr;
	    }
	    // Driver code
	    public static void main(String[] args)
	    {
	    	int n = 0;
	        int i;
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Masukkan panjang array : ");
	        n = input.nextInt();
	        // initial array of size 10
	        int arr[]
	            = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	  
	        // print the original array
	        System.out.println("\nInitial Array :\n"
	                           + Arrays.toString(arr) + "\n");
	       
	        arr = main2(n, arr);
	        
	        System.out.println("Initial Array setelah dirubah:\n"
                    + Arrays.toString(arr));
	  
	        // element to be added
	        int x = 50;
	  
	        // call the method to add x in arr
	        arr = main(n, arr, x);
	  
	        // print the updated array
	        System.out.println("\nArray with " + x
	                           + " added:\n"
	                           + Arrays.toString(arr));	        
	    }
	}
}
