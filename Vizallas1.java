package vizallas1;

import java.io.*;
import java.util.*;

public class Vizallas1 {

    private static ArrayList<Mérés> meresek = new ArrayList<>();

    private static void f1(String label) {
        System.out.println(label);
        inputFile("src/vizallas1/viz.txt");
        System.out.println("\tRekordok száma: " + meresek.size());
    }

    private static void f2(String label) {
        System.out.println(label);
        for (int i = 0; i < meresek.size(); i++) {
            if (meresek.get(i).getDatum().equals("2002.12.31")) {
                System.out.println("\t" + meresek.get(i).toString());
            }
        }
    }

    private static void f3(String label) {
        System.out.println(label);
        int db = 0;
        for (int i = 0; i < meresek.size(); i++) {
            if (meresek.get(i).getFolyo().equals("Tisza") && meresek.get(i).getVizallas() > 900) {

                db++;
            }
        }
        System.out.println("\t" + db + " alkalommal");
    }

    private static void f4(String label) {
        System.out.println(label);
        String legmagdatum = "";
        for (int i = 0; i < meresek.size(); i++) {
            if (meresek.get(i).getVizallas() == 928) {
                legmagdatum = meresek.get(i).getDatum();
            }
        }

        for (int a = 0; a < meresek.size(); a++) {
            if (meresek.get(a).getDatum().equals(legmagdatum) && meresek.get(a).getFolyo().equals("Duna")) {
                System.out.println("\t" + meresek.get(a).toString());
            }
        }

    }

    private static void f5(String label) {
        System.out.println(label);
        int max = 0;
        for (int i = 0; i < meresek.size(); i++) {
            if (meresek.get(i).getVaros().equals("Budapest") && meresek.get(i).getVizallas() > max) {
                max = meresek.get(i).getVizallas();
            }
        }
        
        for (int a = 0; a < meresek.size(); a++) {
            if ( meresek.get(a).getVaros().equals("Budapest") && meresek.get(a).getVizallas() == max) {
                System.out.println("\t" + meresek.get(a).getDatum() + "\t" + meresek.get(a).getVizallas() + " cm");
            }
        }
    }

    private static void f6(String label) {
        System.out.println(label);
    }

    private static void inputFile(String path) {
        try {
            RandomAccessFile f = new RandomAccessFile(path, "r");
            String sor = f.readLine();
            while (sor != null) {
                meresek.add(new Mérés(sor));
                sor = f.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        System.out.println("\tFájl beolvasása kész");
    }

    public static void main(String[] args) {
        f1("1.feladat");
        f2("2.feladat: vizallasok 2002 szilveszteren");
        f3("3.feladat: 9 meternel magasabb vizallasok");
        f4("4.feladat");
        f5("5.feladat: a budapesti legmagasabb vízállás");
        f6("6.feladat: varosok");
    }
}
