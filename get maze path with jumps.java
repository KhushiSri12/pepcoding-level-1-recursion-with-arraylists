/*
PEPCODING LEVEL-1 RECURSION WITH ARRAYLISTS 

GET Maze Path With Jumps
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
        ArrayList<String> paths=new ArrayList<>();
        
        
        for(int i=1;i<=dc-sc;i++){
            ArrayList<String> hpaths=getMazePaths(sr,sc+i,dr,dc);
            for(String hp:hpaths){
            paths.add("h"+i+hp);
            }   
        }
        
        
        for(int i=1;i<=dr-sr;i++){
            ArrayList<String> vpaths=getMazePaths(sr+i,sc,dr,dc);
            for(String vp:vpaths){
            paths.add("v"+i+vp);
            }    
        }
        
        for(int i=1;i<=dc-sc && i<=dr-sr;i++){
            ArrayList<String> dpaths=getMazePaths(sr+i,sc+i,dr,dc);
            for(String dp:dpaths){
            paths.add("d"+i+dp);
            }  
        }
        
        return paths;
    }

}