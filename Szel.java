
package idojaras;


public class Szel {
    private double sebesseg;//km/h
    private String irany;

    public Szel(double sebesseg, String irany) {
        this.sebesseg = sebesseg;
        this.irany = irany;
    }

    public double getSebesseg() {
        return sebesseg;
    }

    public String getIrany() {
        return irany;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public void setIrany(String irany) {
        this.irany = irany;
    }
    
}
