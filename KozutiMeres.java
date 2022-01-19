
package kozut;


public class KozutiMeres {
    private int ora, perc, mp;
    private String rendszam;

    public KozutiMeres(String sor) {
        String[]t=sor.split(";");
        this.ora = Integer.parseInt(t[0]);
        this.perc = Integer.parseInt(t[1]);
        this.mp = Integer.parseInt(t[2]);
        this.rendszam = t[3];
    }
    
    public int szamolIdo(){
        int ossze=(this.ora*60*60)+(this.perc*60)+this.mp;
        return ossze;
    }
    
    public int getOra() {
        return ora;
    }

    public int getPerc() {
        return perc;
    }

    public int getMp() {
        return mp;
    }

    public String getRendszam() {
        return rendszam;
    }
    
    
    
}
