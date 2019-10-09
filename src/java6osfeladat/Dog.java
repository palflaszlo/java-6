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
public class Dog extends Pet {
    private String breed;

    public Dog(String breed, String name) {
        super(name, 4); // várja a nevét és a lábak számát ez egy ősosztály
        this.breed = breed;
    }

    @Override
    public void Description() {
        System.out.printf("Ez egy %s fajtájú kutya, a neve %s\n", this.breed, super.name);
//super.Description(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void Voice(){
        System.out.println("Vau vau...");
    }
    
    
}
