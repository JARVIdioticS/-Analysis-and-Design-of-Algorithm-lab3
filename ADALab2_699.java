//64050699 สรวิศ วงศ์ษา
import java.util.*;
public class ADALab2_699 {
    public static void main(String args[]) {
        int arr[] = new int[100];
        Random rd = new Random();
        Scanner sn = new Scanner(System.in);

        System.out.print("X = ");
        int in = sn.nextInt();
        sn.close();

        int count = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(100);
            if (arr[i] == in) {
                count++;
                if (count == 1) System.out.print("Position(s) of X("+in+") is/are :");
                System.out.print(i+1+" ");
            }
        }
        System.out.printf("\nThe random numbers generated are :");
        for(int a: arr) System.out.print(a+" ");
        
        System.out.printf("\nThere is/are %d in total.", count);
        if (count == 0) {
            System.out.printf("\nWe couldn't find the number you were looking for.");
        }
    }
}