
package mikulas1;

import java.io.*;
import java.util.*;


public class Mikulas1 {
    
    private static RandomAccessFile f;
    private static final ArrayList<Tanulo> tanulok=new ArrayList<>();
    
    private static void f1(String label){
        System.out.println("Szekely Maria");
        System.out.println(label);
        inputFile("src/mikulas1/pontok.txt");
        
        for (int i=0; i<3; i++){
            System.out.println(tanulok.get(i).outPontok());}
    }
    private static void f2(String label){
        System.out.println(label);
        for (int i = 0; i < 3; i++) {
            System.out.println(tanulok.get(i).outSzaloncukor());
        }
    }
    private static void f3(String label){
        System.out.println(label);
        for (int i = 0; i <tanulok.size(); i++) {
            if(tanulok.get(i).getSzaloncukor()>17){
            System.out.println(tanulok.get(i).outSzaloncukor());}
        }
    }
    private static void f4(String label){
        System.out.println(label);
        for (int i = 0; i <tanulok.size(); i++) {
            if(tanulok.get(i).isJarneki()){
            System.out.println(tanulok.get(i).outKiegeszites());}
        }
    }
    private static void inputFile(String path){
        try {
            f=new RandomAccessFile(path,"r");
            String sor=f.readLine();
            while (sor!=null){
                tanulok.add(new Tanulo(sor));
                sor=f.readLine();
                }
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1); //programm kilovese
        }
        System.out.println("\tA fajl beolvasasa...kesz!");
    }
            
    public static void main(String[] args) {
        f1("1.feladat");
        f2("2.feladat");
        f3("3.feladat");
        f4("4.feladat");
    }
    
}
