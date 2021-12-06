package Sort;

import Function.Function;
public class SelectionSort {
    public static void main(String args[])
    {
        int arr[] ={5,4,3,2,1};
        selectionSort(arr);
        for(int x : arr)
        {
            System.out.println(x);
        }

    }
    static void selectionSort(int arr[])
    {
        int index=0;
        int j;
        for (int i = 0; i<arr.length-1;i++)
        {
            index=i;
            for(j=i+1;j< arr.length; j++ )
            {
                if( arr[index] >= arr[j])
                {
                    index=j;
                }
                
            }
            Function.sort(arr,i,index);
           
        }
    }    
    
}
