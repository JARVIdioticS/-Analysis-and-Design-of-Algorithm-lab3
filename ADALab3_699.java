//64050699 สรวิศ วงศ์ษา
import java.util.*;
public class ADALab3_699 {
    public static void main(String args[]) {
        int arr[] = new int[100];
        Random rd = new Random();
        Scanner sn = new Scanner(System.in);

        //fill inputs
        int count = 0;
        for (int i = 0; i < arr.length; i++) arr[i] = rd.nextInt(100);
        
        while (isSorted(arr) == false) shuffle(arr);
    }
    
    private boolean isSorted(int[]arr)
    {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1]) return false;
        return true;
    }

    private void shuffle(int[]arr)
    {
		List<Integer> intList = Arrays.asList(arr);
		Collections.shuffle(intList);
		intList.toArray(arr);
		System.out.println(Arrays.toString(arr));
    }
}
