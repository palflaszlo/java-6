/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6osfeladat; //haziallatok

/**
 *
 * @author Diak
 */
public abstract class Pet {
    protected String name;
    protected int numberOfLegs;

    public Pet(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }
    
    public void Description(){
        System.out.println("nem sokat tudunk erről az állatról!");
    }
    
    public int HowManyLegs(){
        return this.numberOfLegs;
    }
    
    public abstract void Voice();
}
