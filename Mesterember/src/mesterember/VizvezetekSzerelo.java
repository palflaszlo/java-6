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
public class VizvezetekSzerelo extends MesteremberA{
    private int tapasztalatiEvek;

    public VizvezetekSzerelo(int tapasztalatiEvek, String nev, int napiDij) {
        super(nev, napiDij);
        this.tapasztalatiEvek = tapasztalatiEvek;
    }

    @Override
    public String toString() {
        return String.format(super.toString()+" --- %d évnyi tapasztalat\n", this.tapasztalatiEvek);
//"VizvezetekSzerelo{" + "tapasztalatiEvek=" + tapasztalatiEvek + '}';
    }

    @Override
    public boolean MunkaVallal(int param) {
        if(param-1 == 0){
            return false;
        }
        else if(param-1 == 30){
            return false;
        }
        else{
            if(super.foglaltNapok[param-1] 
            && super.foglaltNapok[param-2] 
            && super.foglaltNapok[param]){
                for(int i = param-2; i<param+1; i++){
                    super.foglaltNapok[i] = true;
                }
                return true;
            }
            else{
                return false;
            }
        }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
