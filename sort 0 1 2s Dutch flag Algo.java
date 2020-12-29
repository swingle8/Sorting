// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    
 // } Driver Code Ends


//User function template for Java

public static void sort012(int a[], int n){
    int start = 0;
    int mid = 0;
    int end = n-1;
    //int iterator = 0;
    
    while (mid <= end) {
        int num = a[mid];
        if (num == 0) {
            a[mid] = a[start];
            a[start] = num;
            start++;
            mid++;
        }
        else if (num == 1) {
            mid++;
        }
        else {
            a[mid] = a[end];
            a[end] = num;
            end--;
        }
    }
}

// { Driver Code Starts.

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends