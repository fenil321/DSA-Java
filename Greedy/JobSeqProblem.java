import java.util.*;
public class JobSeqProblem {
    static class Job {
        int id; //0(A), 1(B), 2(C)
        int deadline;
        int profit;

        public Job(int id, int d, int p) {
            this.id = id;
            this.deadline = d;
            this.profit = p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][] = { {4,20},{1,10},{1,40},{1,30} };
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit); // Sort jobs in descending order of profit
        
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        //print the optimal job sequence
        System.out.print("max job: "+seq.size()+"\n");
        for(int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        //System.out.println("Optimal job sequence: " + seq);
    }
}
