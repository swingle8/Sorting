//https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1

// Approach : make graph of the array and just swap if any element is not following the wave rule.

class Wave{

    public static void convertToWave(int arr[], int n){
        
        int previous = arr[0];
        //boolean odd = true;
        for (int i = 1 ; i < arr.length ; i++) {
        	if (i%2 != 0 && previous < arr[i]) {
            	arr = swap(i-1, i, arr);
            }
            else if (i%2 == 0 && previous > arr[i]) {
                arr = swap(i-1, i, arr);
            }
            previous = arr[i];
        }
        
        //return arr;
        
    }
      public static int [] swap (int a, int b, int [] arr) {
    	int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        
        return arr;
    }
    
}
