import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scan.nextInt();
        System.out.println("Enter Array");
        int[] nums = new int[n];
        for (int i=0;i< nums.length;i++)
            nums[i] = scan.nextInt();
        System.out.println("Enter target");
        int val = scan.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0;i< nums.length;i++)
            al.add(nums[i]);
        System.out.println(al);
        al.removeAll(Collections.singleton(val));
        System.out.println(al.size());
    }
}
