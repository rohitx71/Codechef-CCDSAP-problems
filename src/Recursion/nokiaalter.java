package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nokiaalter {

    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int numberOfTestcases = Integer.parseInt(reader.readLine());

        int[] minSplit = new int[53];
        int[] maxSplit = new int[53];
        minSplit[0] = 0;
        maxSplit[0] = 0;

        for (int j = 1; j <= 51; j++) {
            int k = j / 2;
            minSplit[j] = minSplit[k] + minSplit[j - k - 1] + j + 1;
            maxSplit[j] = maxSplit[0] + maxSplit[j - 1] + j + 1;
        }

        for (int i = 0; i < 51; i++) {
            System.out.println(i + ":" + minSplit[i] + " : " + maxSplit[i]);
        }


       /* for (int i = 1; i <= numberOfTestcases; i++) {
            String[] input = reader.readLine().split(" ");
            //int[] inputArr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            int numberOfSpots = inputArr[0];
            int wireInMiles = inputArr[1];

            if (wireInMiles < minSplit[numberOfSpots]) {
                System.out.println("-1");
            } else if (wireInMiles <= maxSplit[numberOfSpots]) {
                System.out.println("0");
            } else {
                System.out.println(wireInMiles - maxSplit[numberOfSpots]);
            }
        }*/
    }

}

