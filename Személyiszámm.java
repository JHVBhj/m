
package személyiszámm;

import java.io.*;
import java.util.*;

public class Személyiszámm {

    private static RandomAccessFile f;
    private static ArrayList<class_szemely> szemelyek = new ArrayList<>();

    private static void f1(String label) {
        System.out.println(label);
        
        inputFile("src/személyiszámm/szemszam.txt");
        System.out.println("\tA fájl beolvasása kész");
        for(int i=0; i<3; i++){
            System.out.println("\t"+szemelyek.get(i).toString());}
    }
    private static void f2(String label){
        System.out.println(label);
        for (int i=0; i<szemelyek.size(); i++){
            if (szemelyek.get(i).getNev().equals("Csak Norisz")){
                System.out.println("\t"+szemelyek.get(i).toString());}
        }
    }
    private static void f3(String label){
        System.out.println(label);
        int minIndex=0;
        for (int i=0; i < szemelyek.size(); i++){
            String aktualis = szemelyek.get(i).getSorszam();
            String tarolt= szemelyek.get(minIndex).getSorszam();
            if(tarolt.compareTo(aktualis)>0){
                minIndex=i;}
        }
        System.out.println("\t"+szemelyek.get(minIndex).toString());
    } 
    private static void inputFile(String path) {
        try {
            f = new RandomAccessFile(path, "r");
            String sor = f.readLine();
            while (sor != null) {
                szemelyek.add(new class_szemely(sor));
                sor = f.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
    }

    public static void main(String[] args)  {
        f1("1.feladat: elso 3");
        f2("2.feladat: csak norrisz");
        f3("3.feladat: legidosebb");
    }


}
