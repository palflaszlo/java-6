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
public enum KartyaErtek {
    KETTO(2),
    HAROM(3),
    NEGY(4),
    OT(5),
    HAT(6),
    HET(7),
    NYOLC(8),
    KILENC(9),
    TIZ(10),
    JUMBO(10),
    DAMA(10),
    KIRALY(10),
    ASZ(11);
    
    private int ertek;
    private KartyaErtek(int ertek){
        this.ertek = ertek;
    }
    
    public int getErtek(){
        return this.ertek;
    }
}
