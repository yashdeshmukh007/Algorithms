package Search;

public class BinarySearch {

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        binarySearch(arr,10);
    }
    private static void binarySearch(int arr[], int val)
    {
        int start=0,end=arr.length-1;
        int mid=0;
        while(start<=end)
        {   
            mid=start+(end-start)/2;
            if(arr[mid]==val)
            {
                System.out.print("item Found");
                break;
            }
            else
            {
                if(arr[mid]<val)
                    start=mid+1;
                else if(arr[mid]>val)
                    end=mid-1;
            }

        }
    }
}
