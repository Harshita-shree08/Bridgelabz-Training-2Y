
import java.util.Scanner;

public class LC1295 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int digits = 0;

            while (num > 0) {
                num = num / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        System.out.println("Numbers with even digits: " + count);

        sc.close();
    }
}