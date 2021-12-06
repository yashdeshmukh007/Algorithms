package Search;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int n;
        Scanner sc= new Scanner(System.in);
     
        n=sc.nextInt();
        linearSearch(arr,n);
    }   

     public static  void linearSearch(int arr[] ,int n)
    {

        boolean f=false;
        for (int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == n)
            {
                f=true;
                System.out.print("Found");
                break;
            }
        }
        if(!f)
        {
            System.out.print("Not Found");
        }

    }
    
}
