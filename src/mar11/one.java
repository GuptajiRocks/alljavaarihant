package mar11;
import java.util.Scanner;
import java.util.Arrays;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many borrowers?: ");
        long nb = sc.nextLong();
        long[] arr1 = new long[(int) nb];
        for(int i = 0; i<arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(arr1));

    }

}
