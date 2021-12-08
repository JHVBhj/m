
package triatlon;

   
public class Versenyzo {
    private final String nev, uszas_time, kerekpar_time, futas_time, szumma_time;
    private int uszas, kerekpar, futas, szumma;

    

    public Versenyzo(String sor) {
        String[] t=sor.split(";");
        this.nev=t[0];
        this.uszas=Integer.parseInt(t[1]);
        this.kerekpar=Integer.parseInt(t[2]);
        this.futas=Integer.parseInt(t[3]);
        this.uszas_time=fx_ooppss(uszas);
        this.kerekpar_time=fx_ooppss(kerekpar);
        this.futas_time=fx_ooppss(futas);
        this.szumma=uszas+kerekpar+futas;
        this.szumma_time=fx_ooppss(szumma);
        
    }
    private String fx_ooppss(int time){
        String hh,pp,ss;
        int h,p,s;
        h=time/3600;
        
        if(h<10){  //itt az orat alakitom at
        hh="0"+h;
        }else{hh=""+h;
        }
        
        p=(time-h*3600)/60;
        if(p<10){  //itt a percet alakitom at
        pp="0"+p;
        }else{pp=""+p;
        }
        
        s=time-h*3600-p*60;
        if(s<10){  //itt a percet alakitom at
        ss="0"+s;
        }else{ss=""+s;
        }
        return hh+":"+pp+":"+ss;
    }

    @Override
    public String toString() {
        return  nev + "\t"+ uszas_time+ "\t"+ kerekpar_time+ "\t"+ futas_time;
    }
    
}
