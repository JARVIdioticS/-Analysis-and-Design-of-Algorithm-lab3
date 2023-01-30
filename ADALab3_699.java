//64050699 สรวิศ วงศ์ษา
import java.util.*;
public class ADALab3_699 {
    public static void main(String args[]) {
	System.out.println("This is Bogo sorter");
	
	Scanner sn = new Scanner(System.in);
	System.out.print("please enter number of array indexes you want: ");
	int index = sn.nextInt();
	System.out.print("please enter number of input limit you want: ");
	int limit = sn.nextInt();
	sn.close();
	    
        Integer arr[] = new Integer[index];
        Random rd = new Random();

        //fill inputs
        int count = 0;
        for (int i = 0; i < arr.length; i++) arr[i] = rd.nextInt(limit);
        
        while (isSorted(arr) == false) {
    		count++;
    		System.out.println("Count: " + count);
    		shuffle(arr);
    	}
	System.out.println(Arrays.toString(arr));
	System.out.println("Finish sorting after shuffled "+ count +" times");
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
    }
}
