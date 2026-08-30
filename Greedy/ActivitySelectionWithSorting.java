import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionWithSorting {
    public static void main(String[] args) { //o(n)
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        
        //for this problem we need to sort the activities based on their end time
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; //activity number
            activities[i][1] = start[i]; //start time
            activities[i][2] = end[i]; //end time
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); //sort based on end time
        
        //end time basis sorted activities
        int maxAct=0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity is always selected
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum number of activities: " + maxAct);
        
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }

    }
}
