
package idojaras;


public class Idojaras {

    
    public static void main(String[] args) {
        Szel szel1=new Szel(70,"Ny");
        System.out.println(szel1.getIrany());
        System.out.println(szel1.getSebesseg());
        szel1.setSebesseg(100);
        System.out.println(szel1.getSebesseg());
    }
    
}
