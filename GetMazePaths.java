
import java.util.ArrayList;
import java.util.Scanner;


public class GetMazePaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> res = getMazePaths(1,1,n, m);
        System.out.print(res);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr== dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();
//        h path
        if(sc < dc){
            hPaths= getMazePaths(sr, sc+1, dr, dc);
        }
//        vpath
        if(sr < dr){
            vPaths= getMazePaths(sr +1, sc, dr, dc);
        }
        ArrayList<String> Paths = new ArrayList<>();
        for (String hPath : hPaths) {
            Paths.add("h" + hPath);
        }
        
        for (String vPath : vPaths) {
            Paths.add("v" + vPath);
        }
        
        return Paths;
    }
}
