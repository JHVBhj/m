
package vizallas1;


public class Mérés {
    private int vizallas;
    String datum;
    private String varos, folyo;
    
   

    public Mérés(String sor) {
        String[]t=sor.split("\t");
        this.vizallas = Integer.parseInt(t[1]);
        this.datum = t[0];
        this.varos = t[2];
        this.folyo = t[3];
    }

    @Override
    public String toString() {
        return "\t"+varos+"\t"+vizallas+" cm" ;
    }
    
    public int getVizallas() {
        return vizallas;
    }

    public String getDatum() {
        return datum;
    }

    public String getVaros() {
        return varos;
    }

    public String getFolyo() {
        return folyo;
    }
    
}
