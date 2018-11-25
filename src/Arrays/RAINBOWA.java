package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class RAINBOWA {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String arr[] = bufferedReader.readLine().split("\\s+");
            Set<String> rainbowValues = new TreeSet();
            int sum = 0;
            for (int i = 0; i < n / 2 + 1; i++) {
                if (arr[i].equals(arr[n - 1 - i])) {
                    if (!rainbowValues.contains(arr[i])) {
                        sum += Integer.parseInt(arr[i]);
                        rainbowValues.add(arr[i]);
                    }
                } else {
                    break;
                }
            }
            if (rainbowValues.size() == 7 && sum == 28) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
