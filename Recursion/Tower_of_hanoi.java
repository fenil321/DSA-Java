public class Tower_of_hanoi {
    public static void towerofhanoi(int n, String src, String helper, String dest) {
        if (n==1) {
            System.out.println("Transfer Disk : "+n+" From " +src+ "To "+ dest);
            return;
        }
        towerofhanoi(n-1, src, dest, helper);
        System.out.println("Transfer Disk : "+n+" From " +src+ "To "+ dest);
        towerofhanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerofhanoi(n, "S", "H", "D");
    }
}
