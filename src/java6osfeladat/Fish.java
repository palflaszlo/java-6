/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6osfeladat;

/**
 *
 * @author Diak
 */
public class Fish extends Pet{

    public Fish(String name) {
        super(name, 0);
    }

    @Override
    public void Description() {
        System.out.printf("%s nevű hal!\n", super.name);
//super.Description(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    @Override
    public void Voice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
