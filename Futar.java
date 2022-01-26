/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futar;

import java.io.*;
import java.util.*;
public class Futar {
    private static RandomAccessFile f;
    private static ArrayList<nap> napok = new ArrayList<>();
     
    private static void f1(String label) {
        System.out.println(label);
        inputFile("src/futar/tavok.txt");
            
        System.out.println("\tA fájl beolvasása kész!");
        System.out.println("\tA hét legelső útja "+napok.get(0).getKm()+" km a legutolsó "+napok.get(napok.size()-1).getKm()+" km volt.");
        
    }
    private static void f2(String label) {
        System.out.println(label);
        boolean[]egyhet= new boolean[8];
        int[]szabadnapok;
        for (int i = 0; i < napok.size(); i++) {
            for (int j = 0; j < egyhet.length; j++) {
                //int s=egyhet[j];
                if(napok.get(i).getNap()==j){
                    egyhet[j]=true;
                } 
                 
            }
        }
        System.out.print("\tSzabadnap:");
        for (int i = 1; i < 8; i++) {
            if(egyhet[i]==false){
                System.out.print(" "+i);
                }
            
        }
        System.out.println("");
                
    }
    private static void f3(String label) {
        System.out.println(label);
        List<Integer> fuvar = new ArrayList<>();
        for (int i = 0; i < napok.size(); i++) {
            fuvar.add(napok.get(i).getFuvarszam());   
        }
        int maxim=Collections.max(fuvar);
        System.out.print("\tA legtöbb fuvar a ");
        for (int i = 0; i < napok.size(); i++) {
            if(napok.get(i).getFuvarszam()==maxim){
                System.out.print(napok.get(i).getNap()+". ");
            }
            
        }
        System.out.println("napon volt, a fuvarok száma "+maxim+".");
    
    }
    @SuppressWarnings("empty-statement")
    private static void f4(String label) {
        System.out.println(label);
        int h=0,k=0,sz=0,cs=0,p=0,szo=0,v=0;
        
        for (int i = 0; i < napok.size(); i++) {
            if(napok.get(i).getNap()==1){
                h+=napok.get(i).getKm();
            }
            if(napok.get(i).getNap()==2){
                k+=napok.get(i).getKm();
            }
            if(napok.get(i).getNap()==3){
                sz+=napok.get(i).getKm();
            }
            if(napok.get(i).getNap()==4){
                cs+=napok.get(i).getKm();
            }
            if(napok.get(i).getNap()==5){
                p+=napok.get(i).getKm();
            }
            if(napok.get(i).getNap()==6){
                szo+=napok.get(i).getKm();
            }
            if(napok.get(i).getNap()==7){
                v+=napok.get(i).getKm();
            }
        }
        
        System.out.println("\t1. nap: "+h+" km");
        System.out.println("\t2. nap: "+k+" km");
        System.out.println("\t3. nap: "+sz+" km");
        System.out.println("\t4. nap: "+cs+" km");
        System.out.println("\t5. nap: "+p+" km");
        System.out.println("\t6. nap: "+szo+" km");
        System.out.println("\t7. nap: "+v+" km");
        int[]legnagyobb={h,k,sz,cs,p,szo,v};
        System.out.println(findMax(legnagyobb));
        //System.out.println("\tA legtöbbet a "+Collections.max(legnagyobb)+". napon kellett tekerni.");
    }
    private static void inputFile(String path) {
        try {
            f = new RandomAccessFile(path, "r");
            String sor = f.readLine();
            while (sor != null) {
                napok.add(new nap(sor));
                sor = f.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        f1("1.feladat");
        f2("2.feladat");
        f3("3.feladat");
        f4("4.feladat: napi teljesítmény");
    }

    
    
}
