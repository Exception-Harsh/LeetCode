import java.util.Scanner;

public class TwoSum {

    public static int[] twoSum(int[] num, int target) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = {2, 7, 11, 15};                   //test case 1 target = 9
        int[] b = {3, 2, 4};                        //test case 2 target = 6
        int[] c = {3, 3};                           //test case 2 target = 6

        System.out.print("Enter target for first, second and third array: ");
        int target_1 = scan.nextInt();
        int target_2 = scan.nextInt();
        int target_3 = scan.nextInt();

        int[] ans_1 = twoSum(a, target_1);
        int[] ans_2 = twoSum(b, target_2);
        int[] ans_3 = twoSum(c, target_3);

        ArrayMethods.printIntArray(ans_1);
        ArrayMethods.printIntArray(ans_2);
        ArrayMethods.printIntArray(ans_3);
    }
}
