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
public class Burkolo extends MesteremberA{
    Helyszin helyszin;

    public Burkolo(Helyszin helyszin, String nev, int napiDij) {
        super(nev, napiDij);
        this.helyszin = helyszin;
    }

    public int osszesSzabadnap(){
        int db = 0;
        for(int i = 0; i< super.foglaltNapok.length; i++){
        db++;    
        }
        return db;
    }

    @Override
    public String toString() {
        return String.format(super.toString()+" --- %s\n", this.helyszin);
//"Burkolo{" + "helyszin=" + helyszin + '}';
    }

    @Override
    public boolean MunkaVallal(int param) {
        if(!super.foglaltNapok[param-1]){
            super.foglaltNapok[param-1] = true;
            return true;
        }
        else{
            return false;
        }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

