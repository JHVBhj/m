
package mozdony;


public class Mozdonny {
    private String sorozat,gyarto,tipus,tulajdonos,alagbavetel;
    private int palyaszam,gyartasiev;

    public Mozdonny(String sor) {
        String[]t=sor.split(";");
        this.gyarto = t[3];
        this.tipus = t[4];
        this.tulajdonos = t[6];
        this.sorozat = t[0];
        this.palyaszam = Integer.parseInt(t[1]);
        this.gyartasiev = Integer.parseInt(t[2]);
        this.alagbavetel = t[5];
    }

    
    public String out1() {
        return  "\t"+sorozat+" " + palyaszam+" " +alagbavetel+" "+ tipus ;
    }

    public String getSorozat() {
        return sorozat;
    }

    public String getGyarto() {
        return gyarto;
    }

    public String getTipus() {
        return tipus;
    }

    public String getTulajdonos() {
        return tulajdonos;
    }

    public String getAlagbavetel() {
        return alagbavetel;
    }

    public int getPalyaszam() {
        return palyaszam;
    }

    public int getGyartasiev() {
        return gyartasiev;
    }
    
    

    
   
    
}
