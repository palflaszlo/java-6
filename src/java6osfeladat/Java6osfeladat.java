/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6osfeladat; //haziallatok

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Diak
 */

public class Java6osfeladat { //Pet

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Pet gyilkos = new Pet("gyilkos", 8);
        Dog gyilkos = new Dog("Csivava", "gyilkos");
        Dog kegyetlen = new Dog("Pitbull", "kegyetlen");
        Fish aranyka = new Fish("aranyka");
        
        List<Pet> haziAllatLista = new ArrayList<>();
        haziAllatLista.add(gyilkos);
        haziAllatLista.add(kegyetlen);
        haziAllatLista.add(aranyka);
        
        for(Pet pet : haziAllatLista) {
            System.out.println(pet.HowManyLegs());
            pet.Description();
        }
        
    }
    
}
