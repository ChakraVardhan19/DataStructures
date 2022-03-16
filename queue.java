import java.util.*;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int larr = sc.nextInt();
        int[] ar = new int[larr];
        for (int i : ar) {
            System.out.println("Enter elem of array:");
            int num = sc.nextInt();
            ar[i] = num;i++;
        }

        sc.close();
    }

}
