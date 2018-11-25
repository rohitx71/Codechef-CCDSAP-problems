package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by rohitx71 on 25-11-2018
 */

public class COPS {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int cops = Integer.parseInt(stringTokenizer.nextToken());
            int mins = Integer.parseInt(stringTokenizer.nextToken());
            int speed = Integer.parseInt(stringTokenizer.nextToken());

            String house_input[] = bufferedReader.readLine().trim().split("\\s+");
            int max_houses = mins * speed;
            int house[] = new int[cops];
            for (int j = 0; j < cops; j++) {
                house[j] = Integer.parseInt(house_input[j]);
            }
            Arrays.sort(house);
            int total = 0, min = 1;
            for (int j = 0; j < cops; j++) {
                int cop = house[j];
                int start = cop - max_houses;

                if(start>min){
                    int house_missed = start - min;
                    if (house_missed > 0)
                        total+=(start-min);
                }
                min = cop + max_houses + 1;
            }
            if(min< 101)
                total+=101-min;
            System.out.println(total);
        }
    }
}