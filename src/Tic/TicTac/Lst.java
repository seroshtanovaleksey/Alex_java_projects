package Tic.TicTac;

import java.io.File;

public class Lst {
    public static void main(String[] args){
        String path=args.length==0?".": args[0];
        File curDir=new File(path);
        File[] files = curDir.listFiles();
        if (files==null) {
            System.out.println("No such directory");
        } else {
            for (File f:files){
                System.out.println(f.getName());
            }
        }



    }
}
