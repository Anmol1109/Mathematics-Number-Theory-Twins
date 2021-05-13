import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = inp.readLine().split(" ");
        int first = Integer.parseInt(s1[0]);
        int last = Integer.parseInt(s1[1]);

        int i = 0;
        int ans = 0;
        for(i = first; i < last; i++) {
            
            int j = i+1;
            int j2 = j+1;
            
            if(isPrime(i)) {
                if(isPrime(j)) {
                    if(j - i == 2) {
                        ans++;
                    }
                }
                if(j2 <= last && isPrime(j2)) {
                    if(j2 - i == 2) {
                        ans++;
                    } 
                }
            }
        }
        
        System.out.println(ans);
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

}
