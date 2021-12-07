
package rendezes;


public class Rendezes {

   
    public static void main(String[] args) {
        int[] tomegek={20,30,10,40,50};
        for (int i = 0; i < tomegek.length; i++) {
            for (int j = 0; j < tomegek.length; j++) {
                if (tomegek[i]<tomegek[j]) {
                    int seged=tomegek[i];
                    tomegek[i]=tomegek[j];
                    tomegek[j]=seged;
                }
                
            }
            
        }
        for (int i = 0; i < tomegek.length; i++) {
            System.out.println(tomegek[i]);}
    }
    
}
