package Sort;
import java.util.*;

import Function.Function;
public class InsertionSort {
    public static void main(String args[])
    {
        int[] arr={5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr)
    {
       
        int last=arr.length-1;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            max=0;
            for(int j=0;j<=last;j++)
            {
                if(arr[max]<arr[j])

                {
                    max=j;
                }
                
            }
            Function.sort(arr, max, last);
            last--;
        }
    }
}
