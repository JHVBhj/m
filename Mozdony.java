
package mozdony;

import java.io.*;
import java.util.*;
public class Mozdony {

    private static RandomAccessFile f;
    private static ArrayList<Mozdonny> mozdonyok = new ArrayList<>();
    private static ArrayList<String> list = new ArrayList<>();
    
    
    private static void f1(String label) {
        System.out.println(label);
        inputFile("src/mozdony/mozdony.txt");
        System.out.println("\tA fájl beolvasása kész");
        System.out.println("\tRekordok száma: "+mozdonyok.size());
    }
    private static void f2(String label) {
        System.out.println(label);
        for (int i = 0; i < mozdonyok.size(); i++) {
            if ((mozdonyok.get(i).getTulajdonos().equals("GySEV")) && 
                    mozdonyok.get(i).getGyartasiev()== 2002){
                        System.out.println(mozdonyok.get(i).out1());}
                }
            
    }
    private static void f3(String label) {
        System.out.println(label);
        int count=0;
        for (int i = 0; i < mozdonyok.size(); i++) {
            if (mozdonyok.get(i).getGyarto().equals("GANZ"))
                    count++;
        }
        System.out.println("\tHibás bejegyzések száma: "+count);
    }
    
    private static void f4(String label) {
        System.out.println(label);
        int ev=0;
        String gyarto="";
        int count=0;
        
        for (int i = 0; i < mozdonyok.size(); i++) {
            if ((mozdonyok.get(i).getSorozat().equals("M47")) 
                && mozdonyok.get(i).getPalyaszam()==2023){
                    ev=mozdonyok.get(i).getGyartasiev();
                    gyarto=mozdonyok.get(i).getGyarto();
                    
                }
            }
        for (int i = 0; i < mozdonyok.size(); i++) {
            if(mozdonyok.get(i).getGyartasiev()==ev && mozdonyok.get(i).getGyarto().equals(gyarto)){
                count++;
            }
            
        }
        System.out.println("\t"+gyarto+" "+ev+"-ban gyártott "+
                    +count+" mozdonya");
        
    }
    
    private static void f5(String label){
        
        System.out.println(label);
        String uj=mozdonyok.get(0).getGyarto();
        list.add(uj);
        for (int i = 0; i < mozdonyok.size(); i++) {
            uj=mozdonyok.get(i).getGyarto();
            int flag=0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).equals(uj)){
                    flag++;
                }
            }
            if(flag==0){
                list.add(uj);
            }    
              
            }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\t"+list.get(i));
        }
        
    }
    private static void inputFile(String path) {
        try {
            f = new RandomAccessFile(path, "r");
            String sor = f.readLine();
            while (sor != null) {
                mozdonyok.add(new Mozdonny(sor));
                sor = f.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        f1("1.feladat");
        f2("2.feladat: 2002 GYESEV");
        f3("3.feladat: Ganz MÁVAG helyett GANZ");
        f4("4.feladat: visszahívás");
        f5("5.feladat: visszahívás");
    }
    
}
