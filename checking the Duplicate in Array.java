import java.util.*;
public class Main
{
    public static  boolean Duplicate (int [] arr)
    {
        HashSet<Integer> ha= new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(ha.contains(arr[i]))
              return true;
            ha.add(arr[i]);
        }
        return false;
 
    }
	public static void main(String[] args) {
	    int arr[]= {1,22,5,4,5};
	    System.out.println(Duplicate(arr));

	}
}