// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Inversion_of_Array().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Inversion_of_Array
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    
    static long inversionCount(long arr[], long N)
    {
        Inversion_of_Array ioa = new Inversion_of_Array();
        return ioa.divide(arr, 0, arr.length-1, 0);
    }
    
    long divide (long [] arr, int start, int end, long counter) {
        if (start >= end)
            return counter;
        
        int mid = start + (end - start)/2;
        long count1 = divide (arr, start, mid, counter);
        long count2 = divide (arr, mid+1, end, counter);
        counter = counter + count1 + count2;
        return merge (arr, start, mid, end, counter);
        
    }
    
    long merge (long [] arr, int start, int mid, int end, long counter) {
        //int counter = 0;
        int len1 = mid - start + 1;
        int len2 = end - mid;
        
        long [] arr1 = new long[len1];
        long [] arr2 = new long[len2];

        for (int i = 0 ; i < len1 ; i++)
            arr1[i] = arr[i+start];
            
        for (int i = 0 ; i < len2 ; i++)
            arr2[i] = arr[i+mid+1];
        
        int i = 0;
        int j = 0;
        int pointer = start;
        while (i < len1 && j < len2) {
            if (arr1[i] > arr2[j]) {
                counter = counter + mid-i-start+1;
                arr[pointer] = arr2[j];
                j++;
                pointer++;
            }
            else {
                arr[pointer] = arr1[i];
                i++;
                pointer++;
            }
        }
        
        while (i < len1) {
            arr[pointer] = arr1[i];
            pointer++;
            i++;
        }
        
        while (j < len2) {
            arr[pointer] = arr2[j];
            pointer++;
            j++;
        }
            
        return counter;
    }
    
    
}