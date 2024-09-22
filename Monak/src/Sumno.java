import java.util.Scanner;

public class Sumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            String[] input = scanner.nextLine().split(" ");
            int[] ar = new int[n];
            for (int j = 0; j < n; j++) {
                ar[j] = Integer.parseInt(input[j]);
            }
            String[] sign = getSign(ar);
            logic(sign);
        }
    }

    private static String[] getSign(int[] a) {
        String[] b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                b[i] = "+";
            } else {
                b[i] = "-";
            }
        }
        return b;
    }

    private static void logic(String[] a) {
        int l = a.length;
        int[] numbers = new int[l];
        numbers[l - 1] = 1;

        for (int i = l - 2; i >= 0; i--) {
            int prev = i + 1;//8+1=9 
            int cur = i;//8
            if (a[prev].equals(a[cur])) {//9.8
                numbers[cur] = 1;
            } else {
                numbers[cur] += numbers[prev] + 1;//8+=9+1//8+=10
            }
        }
        for (int x : numbers) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
