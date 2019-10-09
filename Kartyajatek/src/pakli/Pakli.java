/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakli;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Diak
 */
public class Pakli {
    
    private List<Kartya> kartyak;
    
    public Pakli(){
        this.kartyak = new LinkedList<>();
        
        for(KartyaSzin szin : KartyaSzin.values()) {
            for(KartyaErtek ertek : KartyaErtek.values()) {
                this.kartyak.add(new Kartya(szin,ertek));
            }
        }
    }
    
    public void Kever() {
        for(int i = 0; i < 1000; i++){
            int veletlenI = (int)(Math.random()*(this.kartyak.size()));
            int veletlenJ = (int)(Math.random()*(this.kartyak.size()));
            
            Kartya temp = this.kartyak.get(veletlenI);
            this.kartyak.set(veletlenI, this.kartyak.get(veletlenJ));
            this.kartyak.set(veletlenJ, temp);
            
        }
    }

    @Override
    public String toString() {
        String s =  "";
        for(Kartya kartya : this.kartyak){
            s += kartya + "\n";
        }
        
        return s;
//"Pakli{" + "kartyak=" + kartyak + '}';
    }
    
    
    
}
