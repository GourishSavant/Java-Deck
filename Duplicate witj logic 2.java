import java.util.*;
public class Main
{
    public static  boolean Duplicate (int [] arr)
    {
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==arr[i+1]){
               return true;
           }
       }
       return false;
    }
	public static void main(String[] args) {
	    int arr[]= {1,22,5,4,5};
	    System.out.println(Duplicate(arr));

	}
}