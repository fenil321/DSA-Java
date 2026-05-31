public class Shortestpath{
    public static float shortestPath(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            char dir=s.charAt(i);
            if(dir=='N'){
                y++;
            }else if(dir=='S'){
                y--;
            }else if(dir=='W'){
                x--;
            }else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}