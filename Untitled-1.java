import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[1001];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextLong();

        int cnt = 0;
        while (cnt < n && arr[cnt] == 1) {
            cnt++;
        }

        if (cnt == n)
            System.out.println((cnt % 2 == 0) ? "Second" : "First");
        else
            System.out.println((cnt % 2 == 0) ? "First" : "Second");
    }
}