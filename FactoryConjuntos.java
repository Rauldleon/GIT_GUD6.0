/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HDT6;

/**
 *
 * @author Didier
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class FactoryConjuntos {
    /**
     * @param menu
     * @return
     */
    public Set<String> getTipoConjunto (int menu){
        if (menu==1)
            return new HashSet<String>();
        
        if (menu==2)
            return new TreeSet<String>();
        
        if (menu==3)
            return new LinkedHashSet<String>();

        return null; 
    }	
}

