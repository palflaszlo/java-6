/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakli;

/**
 *
 * @author Diak
 */
public class Kartya {
    //2-10 B D K A
    //pikk treff kőr karo 
    
    private KartyaSzin szin;
    private KartyaErtek ertek;

    public Kartya(KartyaSzin szin, KartyaErtek ertek) {
        this.szin = szin;
        this.ertek = ertek;
    }
    
    public Kartya(){
        this.szin = KartyaSzin.KOR;
        this.ertek = KartyaErtek.KETTO;
    }
    
    public String getSzin(){
        return this.szin.name();
    }
    public int getErtek(){
        return this.ertek.getErtek();
    }
    

    @Override
    public String toString() {
        return String.format("%s %s", this.szin, this.ertek);
//"Kartya{" + "szin=" + szin + ", ertek=" + ertek + '}';
    }
    
    
}
