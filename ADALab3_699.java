//64050699 สรวิศ วงศ์ษา
import java.util.*;
public class ADALab3_699 {
    public static void main(String args[]) {
        Integer arr[] = new Integer[100];
        Random rd = new Random();

        //fill inputs
        int count = 0;
        for (int i = 0; i < arr.length; i++) arr[i] = rd.nextInt(100);
        
        while (isSorted(arr) == false) {
		count++;
		shuffle(arr);
	}
	System.out.println("Count: "+ count);
    }
    
    private static boolean isSorted(Integer[]arr)
    {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1]) return false;
        return true;
    }

    private static void shuffle(Integer[]arr)
    {
	List<Integer> intList = Arrays.asList(arr);
	Collections.shuffle(intList);
	intList.toArray(arr);
	System.out.println(Arrays.toString(arr));
    }
}
