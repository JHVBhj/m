
package futar;


public class nap {
    private int nap,fuvarszam,km;

    public nap(String sor) {
        String[] tomb=sor.split(";");
        this.nap = Integer.parseInt(tomb[0]);
        this.fuvarszam = Integer.parseInt(tomb[1]);
        this.km = Integer.parseInt(tomb[2]);
    }

    public int getNap() {
        return nap;
    }

    public int getFuvarszam() {
        return fuvarszam;
    }

    public int getKm() {
        return km;
    }
    
    
    
}
