/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesterember;

/**
 *
 * @author Diak
 */
public abstract class MesteremberA {
    protected String nev;
    protected int napiDij;
    protected boolean[] foglaltNapok = new boolean[31];

    public MesteremberA(String nev, int napiDij) {
        this.nev = nev;
        this.napiDij = napiDij;
        
        for(int i = 0; i< this.foglaltNapok.length; i++) {
            foglaltNapok[i] = false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s --- %d", this.nev, this.napiDij);
        
    }
    
    public abstract boolean MunkaVallal(int param);
        
    }
    
    

