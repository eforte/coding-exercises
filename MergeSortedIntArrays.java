// openjdk version '11.0.5' 
// Run online at: https://rextester.com/RYVTK19381 
// NOTE: to run online 'main' method must be in a class 'Rextester'.

import java.util.*;
import java.lang.*;

class MergeSortedIntArrays
{  
    /** Takes two int arrays a, b with sorted numbers and  
     * merge the contents in to 3rd array c ( \no utility)/*A = 1, 3, 5
     * E.g. 
     * a = 1, 3, 5
     * b = 2, 9
     * c = 1, 2, 3, 5, 9
     * 
     **/ 
    public static void mergeArrays(int[] a, int[]b) 
    {
        if (a == null || b == null) {
          System.out.println("Input error. One or more input array(s) is null");
          return;
        }
        int la = a.length; // len of arr a
        int lb = b.length; // len of arr b
        int[] c = new int[la + lb];    

        // Check if current element of first array is smaller than current element 
        // of second array. If yes, store first array element and increment first
        // array index. Otherwise do the same with second array.
        int i = 0, j = 0, k = 0;
        while (i<la && j<lb) {
            if(a[i] < b[j])
                c[k++] = a[i++];
            else 
                c[k++] = b[j++]; 
        }
        // Store remaining elements of first array
        while (i < la)
              c[k++] = a[i++];
        // Store remaining elements of second array  
        while (j < lb)  
               c[k++] = b[j++]; 
        
        System.out.println(Arrays.toString(c));
    }    
    
    public static void main(String args[]){
        int[] a = {1, 3, 5};
        int[] b = {2, 9};
        mergeArrays(a, b);
    }
}
