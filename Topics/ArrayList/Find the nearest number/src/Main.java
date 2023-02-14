import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String[] arrStr = sc.nextLine().split("\\s");
        int target = sc.nextInt();
        int minAbsDiff = 9999999;
        ArrayList<Integer> listDiff = new ArrayList<>();
        for (String s : arrStr) {
            int temp = Math.abs(target - Integer.parseInt(s));
            if (temp < minAbsDiff) {
                minAbsDiff = temp;
            }
            listDiff.add(target - Integer.parseInt(s));

        }
        Collections.sort(listDiff);
        for (int i = arrStr.length - 1; i >= 0; i--) {
            if (Math.abs(listDiff.get(i)) == minAbsDiff) {
                System.out.print(target - listDiff.get(i) + " ");
            }
        }

    }
}