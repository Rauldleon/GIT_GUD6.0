/* Universidad del valle de guatemala
* Autores
* Didier salazar 15487
* Raul DE Leon	15112
*Esteban Avalos 15059*/
package HDT6;

/**
 *Creacion de los distintos conjuntos de desarrolladores que el usuario ingresa
 *
 */
import java.util.Set;
    
public class Conjuntos {
   
    /* variables*/
    private Set<String> conjuntoMenor;
    private Set<String> subconjuntoMenor;
    private String conjuntoMayor;
    
/* instanciacion de la factory*/
    FactoryConjuntos factory = new FactoryConjuntos(); 
    
/* constructor de los conjuntos*/
    public Conjuntos(int menu){
        conjuntoMenor = factory.getTipoConjunto(menu);
         subconjuntoMenor=factory.getTipoConjunto(menu);
         conjuntoMayor="";
    }
/* metodo para ingrear los datosa a los conjuntos*/
    public void setTable(String elemento){
        conjuntoMenor.add(elemento);
        
    }
/* se regresan los conjuntos y sus datos*/
    public Set<String> getConjunto(){
        return conjuntoMenor;
    }
/* metodo que retorna la union de 3 conjuntos*/
    public Set<String> interseccionTresConjuntos(Set<String> conjunto1,Set<String> conjunto2,Set<String> conjunto3){
        subconjuntoMenor.clear();
        subconjuntoMenor.addAll(conjunto1);
        subconjuntoMenor.retainAll(conjunto2);
        subconjuntoMenor.retainAll(conjunto3);
        
        return subconjuntoMenor;
    }
/* metodo que retorna los desarrolladores que estan en dos conjuntos*/
    public Set<String> inclusionAB(Set<String> conjuntoA,Set<String> conjuntoB){
        subconjuntoMenor.clear();
        subconjuntoMenor.addAll(conjuntoA);
        subconjuntoMenor.removeAll(conjuntoB);
        return subconjuntoMenor;
    }
/* metodo que retorna la interseccion de dos conjuntos y retorna los desarrolladores que estan en el*/
    public Set<String> interseccionDosConjuntos(Set<String> conjunto1,Set<String> conjunto2){
        subconjuntoMenor.clear();
        subconjuntoMenor.addAll(conjunto1);
        subconjuntoMenor.retainAll(conjunto2);
        return subconjuntoMenor;
    }
    /* retorna los desarrolladores que estan en dos conjuntos*/
    public Set<String> unionDosConjuntos(Set<String> conjunto1,Set<String> conjunto2){
        subconjuntoMenor.clear();
        subconjuntoMenor.addAll(conjunto1);
        return subconjuntoMenor;
    }
   /* metodo que retorna que si existe un conjunto en otro conjunto*/
    public boolean subConjuntoAmbos(Set<String> conjunto1,Set<String> conjunto2){
        subconjuntoMenor.clear();
        subconjuntoMenor.addAll(conjunto1);
        subconjuntoMenor.retainAll(conjunto2);
        if (subconjuntoMenor.size()==conjunto1.size()){
            return true;
        }
        else{
            return false;
        }
    }
/* metodo para comparar el tamaño de conjuntos, retorna el mas grande*/
    public Set<String> conjuntoMasGrande(Set<String> conjunto1,Set<String> conjunto2,Set<String> conjunto3){
        subconjuntoMenor.clear();
        if (conjunto1.size()>=conjunto2.size()){
            subconjuntoMenor.addAll(conjunto1);
            conjuntoMayor="El conjunto de Desarrolladores Java";
        }
        else{
            subconjuntoMenor.addAll(conjunto2);
            conjuntoMayor="El conjunto de Desarrolladores Web";
        }
        if (subconjuntoMenor.size()>=conjunto3.size()){
            return subconjuntoMenor;
        }
        else{
           conjuntoMayor="El conjunto de Desarrolladores Celulares";
           return conjunto3; 
        }

    }
/* metodo que retorna en string los valores del conjunto mas grande*/
    public String getConjuntoMayor() {
         return conjuntoMayor;
     }
    //Metodo para imprimir un conjunto de manera ascendente.
    public String getStringConjunto(Set<String> conjunto1){
        String cad= conjunto1.toString();
        cad=cad.replace("]", "");
        cad=cad.replace("[", " ");
        cad=cad.replace(",", "\n");
        return cad;  
    }
    
}