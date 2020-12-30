import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int cases = sc.nextInt();
	    
	    while (cases --> 0) {
	        int n = sc.nextInt();
	        int [] arr = new int[n];
	        for (int i = 0 ; i < n ; i++)
	            arr[i] = sc.nextInt();
	           
	        int students = sc.nextInt();
	        
	        Arrays.sort(arr);
	        int i = 0;
	        int j = students-1;
            int min = Integer.MAX_VALUE;
            
            while (j <= n-1) {
                min = Math.min(min, arr[j] - arr[i]);
                j++;
                i++;
            }	        
	        System.out.println(min);
	    }
	 }
}