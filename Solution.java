import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int solve(int n, int m) {
       int i = 0;
        int ans = 0;
        for(i = n; i < m; i++) {
            
            int j = i+1;
            int j2 = j+1;
            
            if(isPrime(i)) {
                if(isPrime(j)) {
                    if(j - i == 2) {
                        ans++;
                    }
                }
                if(j2 <= m && isPrime(j2)) {
                    if(j2 - i == 2) {
                        ans++;
                    } 
                }
            }
        }
        
        return ans;
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;
        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int result = solve(n, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
