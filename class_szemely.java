
package személyiszámm;


public class class_szemely {
    private String nev, szemelyiszam;
    private String szuletesidatum,sorszam;
    
    public class_szemely(String sor) {
        String[] tomb=sor.split(";");
        this.nev=tomb[0];
        this.szemelyiszam=tomb[1];
        this.szuletesidatum=fx_datum();
        this.sorszam=fx_sorszam();
    }
    private String fx_datum(){
        String ev="19";
        String ch=szemelyiszam.substring(0,1);
        if (ch.equals("3")|| ch.equals("4")){
            ev="20";
        }
        String eeee = ev+szemelyiszam.substring(1,3);
        String hh = szemelyiszam.substring(3,5);
        String nn = szemelyiszam.substring(5,7);
        return eeee+"."+hh+"."+nn;
    }
    private String fx_sorszam(){
        String belsosorszam=szemelyiszam;
        String ch=belsosorszam.substring(0,1);
        if(ch.equals("2")){
            belsosorszam="1"+belsosorszam.substring(1,10);
        }
        return belsosorszam;
    }
    public String getNev() {
        return nev;
    }

    public String getSzemelyiszam() {
        return szemelyiszam;
    }

    public String getSzuletesidatum() {
        return szuletesidatum;
    }

    public String getSorszam() {
        return sorszam;
    }
    
    @Override
    public String toString() {
        return "\t"+nev + " " + szuletesidatum;
    }
    
}
