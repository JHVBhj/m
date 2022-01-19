/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kozut;
import java.io.*;
import java.util.*;
public class Kozut {
    private static ArrayList<KozutiMeres> kozutimeresek = new ArrayList<>();
    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list4 = new ArrayList<>();
    private static List<Integer> list4_2 = new ArrayList<>();
    private static List<String> list5 = new ArrayList<>();
    private static List<String> list5_2 = new ArrayList<>();
    private static void f1(String label){
        System.out.println(label);
        inputFile("src/kozut/jarmu.txt");
        System.out.println("\tRekordok száma: " + kozutimeresek.size());
        
        for (int i = 0; i < kozutimeresek.size(); i++) {
            list1.add(kozutimeresek.get(i).getOra());
            
        }
        
        int num=Collections.max(list1)-Collections.min(list1)+1;
        System.out.println("\tAz ellenőrzést végzők legalább, "+num+" órát dolgoztak.");
        
    }
    private static void f2(String label){
        System.out.println(label);
        System.out.println("\t"+kozutimeresek.get(0).getOra()+":"+kozutimeresek.get(0).getPerc()+":"+kozutimeresek.get(0).getMp()+kozutimeresek.get(0).getRendszam());
        for (int i = 0; i < list1.size()-1; i++) {
            if (list1.get(i) != list1.get(i+1)){
                
                System.out.println("\t"+kozutimeresek.get(i+1).getOra()+":"+kozutimeresek.get(i+1).getPerc()+":"+kozutimeresek.get(i+1).getMp()+kozutimeresek.get(i+1).getRendszam());
            }
            
            
            
            
        }
        
    }
    private static void f3(String label){
        System.out.println(label);
        int m = 0;
        int b = 0;
        int k = 0;
        int e = 0;
        for (int i = 0; i < kozutimeresek.size(); i++) {
            if(kozutimeresek.get(i).getRendszam().substring(0,1).equals("M"))
                m++;
            else if (kozutimeresek.get(i).getRendszam().substring(0,1).equals("B"))
                b++;
            else if (kozutimeresek.get(i).getRendszam().substring(0,1).equals("K"))
                k++;
            else
                e++;
        }
        System.out.println("\tAutóbusz: "+b+"\n\tKamion: "+k+"\n\tMotorkerékpár: "+m+"\n\tSzemélygépkocsi: "+e);
    }
    private static void f4(String label){
        System.out.println(label);
        for (int i = 0; i < kozutimeresek.size(); i++) {
            list4.add(kozutimeresek.get(i).szamolIdo());//masodperces lista
            
        }
        for (int j = 0; j < list4.size(); j++) {
            int max;
                int kulonbseg=((list4.get(j+1))-(list4.get(j)));
                list4_2.add(kulonbseg);
                    max=Collections.max(list4_2);
                
                    
            }
        System.out.println(list4_2);
    }
    private static void f5(String label){
        System.out.println(label);
        
        
        for (int i = 0; i < kozutimeresek.size(); i++) {
            list5.add(kozutimeresek.get(i).getRendszam());
            
        }
        System.out.println(list5);
        HashSet<String> set = new HashSet<>(list5);
        list5.removeAll(new HashSet(list5_2));
        
        
        
        System.out.println(list5_2);
    }
    
    
    
    
    public class Program {
    public static void main(String[] args) {
        
        // Create ArrayList with one duplicate element.
        ArrayList<String> values = new ArrayList<>();
        values.add("cat");
        values.add("dog");
        values.add("cat");
        values.add("bird");
        
        // Create HashSet from ArrayList.
        HashSet<String> set = new HashSet<>(values);
        
        // Create ArrayList from the set.
        ArrayList<String> result = new ArrayList<>(set);
        
        // The result.
        System.out.println(result.toString());
    }
}
   /* private static void inputFile(String path) {
        try {
            RandomAccessFile f = new RandomAccessFile(path, "r");
            String sor = f.readLine();
            while (sor != null) {
                kozutimeresek.add(new KozutiMeres(sor));
                sor = f.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        System.out.println("\tFájl beolvasása kész");
    }*/
    public static void main(String[] args) {
        f1("1.feladat");
        f2("2.feladat: óránkénti ellenőrzés");
        f3("3.feladat: statisztika az ellenőrzőpont előtti áthaladásról");
        //f4("4.feladat: a leghosszabb forgalommentes időszak");
        f5("5.feladat:  a különböző járművek száma");
        
    }
    
}
