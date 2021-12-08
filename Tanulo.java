
package mikulas1;


public class Tanulo {
    private final String nev;
    private final int pont;
    private final int szaloncukor;
    private final boolean jarneki;
    
    public Tanulo(String sor){
    String[] t=sor.split(";");
    this.nev=t[0];
    this.pont=Integer.parseInt(t[1]);
    this.szaloncukor=Integer.parseInt(t[1])/10; //sor/10;
    this.jarneki=szaloncukor % 6 == 0;
    }
    public String outPontok(){
    return "\t"+nev+" "+pont+" pont";
    }
    public String outSzaloncukor(){
    return "\t"+nev+" "+szaloncukor+" db";
    }
    public String outKiegeszites(){
        return "\t"+nev+" "+(szaloncukor+10)+" db";
    }

    public int getSzaloncukor() {
        return szaloncukor;
    }

    public boolean isJarneki() {
        return jarneki;
    }
    
    
    
}
