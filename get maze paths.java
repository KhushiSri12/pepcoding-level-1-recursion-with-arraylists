/*
PEPCODING LEVEL-1 RECURSION WITH ARRAYLISTS 

GET Maze Path
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> paths=getMazePaths(1,1,n,m);
        System.out.println(paths);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpath=new ArrayList<>();
        ArrayList<String> vpath=new ArrayList<>();
            if(sc<dc){
                hpath=getMazePaths(sr,sc+1,dr,dc);
            }
            if(sr<dr){
                vpath=getMazePaths(sr+1,sc,dr,dc);
            }
            ArrayList<String> paths=new ArrayList<>();
            
            for(String hp:hpath){
                paths.add("h"+hp);
            }
            for(String vp:vpath){
                paths.add("v"+vp);
            }
            return paths;
    }

}