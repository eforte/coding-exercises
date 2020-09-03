// openjdk version '11.0.5' 
// Run online at: https://rextester.com/MHB34790 
// NOTE: to run online 'main' method must be in a class 'Rextester'.

import java.util.*;
import java.lang.*;
import java.util.stream.Stream;
import java.io.* ;

/**
 * Combine two arrays in a single array object such that the array elements 
 * maintain their original order in the newly merged array. The elements of 
 * the first array precede the elements of the second array in the newly 
 * merged array. For example:
 * int[] arr1={1, 2, 3, 4, 5, 6};  //first array  
 * int[] arr2={7, 8, 9, 0};    //second array  
 * int[] arr3={1, 2, 3, 4, 5, 6, 7, 8, 9, 0}   //resultant array  
 *
 **/
class CombineArrays
{  
    // function to merge two arrays  
    public static <T> Object[] mergeArray(T[] arr1, T[] arr2) {
        // The Stream.of() method of Stream interface returns a sequential ordered stream whose elements are the values.
        return Stream.of(arr1, arr2).flatMap(Stream::of).toArray();   
    }   
 
    public static void main(String args[])
    {
        // Merge 2 arrays
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        
               
        if (arr1 != null && arr2 != null) {
            int fal = arr1.length;
            int sal = arr2.length;
            
            // Checking boundaries
            if (fal == 0 && sal > 0) {
                System.out.println("First array is emtpy.");
                System.out.println(Arrays.toString(arr2));
                return;
            } else if (fal > 0 && sal == 0) {
                System.out.println("Second array is emtpy.");
                System.out.println(Arrays.toString(arr1));                
                return;
            } else if (fal <= 0 && sal <= 0) {
                System.out.println("Arrays do not contain elements.");
                return;
            }

            // 1 manually
            int[] arr3_1 = new int[fal + sal];        
            for(int i=0; i<fal; i++) {
                arr3_1[i] = arr1[i];
            }
            for(int j=0; j<sal; j++) {
                arr3_1[j+fal] = arr2[j];
            }
            System.out.println("1. Manually");
            System.out.println(Arrays.toString(arr3_1));
        
            // 2 System.copyarray(...)  
            int[] arr3_2 = new int[fal + sal]; 
            System.arraycopy(arr1, 0, arr3_2, 0, fal);
            System.arraycopy(arr2, 0, arr3_2, fal, sal);
            System.out.println("2. System.copyarray");
            System.out.println(Arrays.toString(arr3_2));
        
            // 3 Collections 
            String sarr1[] = {"a", "e", "i"};
            String sarr2[] = {"o", "u"};
            int fsal = sarr1.length;
            int ssal = sarr2.length;
            List list = new ArrayList(Arrays.asList(sarr1));
            list.addAll(Arrays.asList(sarr2));
            
            Object[] sarr3 = list.toArray();
            System.out.println("3. Collections");
            System.out.println(Arrays.toString(sarr3));
            
            // 4. Streams
            Integer[] firstArray = new Integer[]{1,2,3,4};   
            Integer[] secondArray = new Integer[]{5,6,7,8};  
            Object[] mergedArray = mergeArray(firstArray,secondArray);
            System.out.println("4. Streams");
            System.out.println(Arrays.toString(mergedArray));   
               
        }
    }
}
