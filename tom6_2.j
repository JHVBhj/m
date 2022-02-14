package bolygo;

import java.util.*;
public class Bolygo {

    static String[] b={"Merkur","Venusz","Fold","Masr","Jupiter","Szaturnusz","Uranusz","Neptunusz"};
    
    static void kiir(){
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println("");
    }
    static void csere(int n){
        String seg=b[n];
        b[n]=b[n+1];
        b[n+1]=seg;
    }
    static void rendez(){
        for (int i = b.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if(b[j].compareTo(b[j+1])>0)
                    csere(j);
            }
        }
    }
    public static void main(String[] args) {
        
        kiir();
        rendez();
        kiir();
    }
    
}
