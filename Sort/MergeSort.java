package Sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args)
    {
        int arr[]={5,4,3,2,1};
        arr=mergeSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static int[] mergeSort(int arr[])
    {
        if(arr.length==1)
            return arr;

        int mid=arr.length/2;

        int leftArray[]= mergeSort(Arrays.copyOfRange(arr, 0,mid));
        int rightArray[]=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftArray,rightArray);
        
        
    }
    private static int[] merge(int[] leftArray, int[] rightArray) {
        
        int i=0,j=0,k=0;
        int result[]=new int[leftArray.length + rightArray.length];

        while(i<leftArray.length && j<rightArray.length)
        {
            if(leftArray[i]<rightArray[j])
            {
                result[k]=leftArray[i];
                k++;
                i++;
            }
            else
            {
                result[k]=rightArray[j];
                k++;
                j++;
            }
        }
        while(i<leftArray.length)
        {
            result[k]=leftArray[i];
            k++;
            i++;
        }
        while(j<rightArray.length)
        {
            result[k]=leftArray[j];
            k++;
            j++;
        }
        
        
        return result;
    }
    
}
