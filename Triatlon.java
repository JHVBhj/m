
package triatlon;

import java.io.*;
import java.util.*;
public class Triatlon {
    private static RandomAccessFile f;
    private static ArrayList<Versenyzo> versenyzok= new ArrayList<>();
    
    private static void f1(String label){
        System.out.println(label);
        inputFile("src/triatlon/triatlon.txt");
        for (int i = 0; i < versenyzok.size(); i++) {
            System.out.println("\t"+versenyzok.get(i).toString());
        }
    }
    private static void inputFile(String path){
        try {
            f=new RandomAccessFile(path,"r");
            String sor=f.readLine();
            while (sor!=null){
                versenyzok.add(new Versenyzo(sor));
                sor=f.readLine();
                }
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1); //programm kilovese
        }
        System.out.println("\tA fajl beolvasasa...kesz!");
    }
    
    public static void main(String[] args) {
        System.out.println("Szekely Maria");
        f1("1.feladat");
        //f2("2.feladat");
    }
    
}
