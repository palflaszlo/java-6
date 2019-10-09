/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesterember;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Diak
 */
public class Mesterember {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<MesteremberA> mesteremberLista = new ArrayList<>();
        
        mesteremberLista.add(new Burkolo(Helyszin.Belso, "Tapéta Lajos", 60000));
        mesteremberLista.add(new VizvezetekSzerelo(3, "Megszer Elek", 12));
        mesteremberLista.add(new Burkolo(Helyszin.Kulso, "Vakolat Péter",5000));
        mesteremberLista.add(new VizvezetekSzerelo(5, "Víz Elek", 15));
        mesteremberLista.add(new Burkolo(Helyszin.Kulso, "Eresz János", 30000));
        
        for(int i = 0; i < mesteremberLista.size(); i++){
            System.out.println(mesteremberLista.get(i));
        }
    }
    
}
