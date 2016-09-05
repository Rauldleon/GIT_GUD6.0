/* Universidad del valle de guatemala
* Autores
* Didier salazar 15487
* Raul DE Leon	15112
*Esteban Avalos 15059*/
package HDT6;

/**
 *  creacion de los distintos conjuntos de desarrolladores, dependiendo de que indique 
 *el usuario a ellos los contos  estaran ingresados
 */

/* importacion de librerias*/
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class FactoryConjuntos {

/* creacion de cada conjunto, se instancioan los objetos de cada tipo*/
   
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
