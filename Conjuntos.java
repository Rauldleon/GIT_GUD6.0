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
import java.util.Set;
    
public class Conjuntos {
   
     // Se crean las variables a utilizar
    private Set<String> conjuntoMenor;
    private Set<String> subconjuntoMenor;
    private String conjuntoMayor;
    //Se crea la clase Factory
    FactoryConjuntos factory = new FactoryConjuntos(); 
    
    //Constructor para inicizlizar los conjuntos y variables
    public Conjuntos(int menu){
        conjuntoMenor = factory.getTipoConjunto(menu);
         subconjuntoMenor=factory.getTipoConjunto(menu);
         conjuntoMayor="";
    }
    //Metodo para agregar un elemento al conjunto
    public void setTable(String elemento){
        conjuntoMenor.add(elemento);
        
    }
    //Metodo para retornar el conjunto.
    public Set<String> getConjunto(){
        return conjuntoMenor;
    }
    //Metodo que devuelve la interseccion de tres conjuntos
    public Set<String> interseccionTresConjuntos(Set<String> conjunto1,Set<String> conjunto2,Set<String> conjunto3){
        subconjuntoMenor.clear();
        subconjuntoMenor.addAll(conjunto1);
        subconjuntoMenor.retainAll(conjunto2);
        subconjuntoMenor.retainAll(conjunto3);
        
        return subconjuntoMenor;
    }
       //Metodo donde se ingresan dos conjuntos y se retorna todos los elementos de A que no estan contenidos en B
    public Set<String> inclusionAB(Set<String> conjuntoA,Set<String> conjuntoB){
        subconjuntoMenor.clear();
        subconjuntoMenor.addAll(conjuntoA);
        subconjuntoMenor.removeAll(conjuntoB);
        return subconjuntoMenor;
    }
    //Metodo donde se ingresan dos conjuntos y se retorna la interseccion de ambos.
    public Set<String> interseccionDosConjuntos(Set<String> conjunto1,Set<String> conjunto2){
        subconjuntoMenor.clear();
        subconjuntoMenor.addAll(conjunto1);
        subconjuntoMenor.retainAll(conjunto2);
        return subconjuntoMenor;
    }
    //Metodo donde se ingresan dos conjuntos y se retorna un conjunto con la union de estos dos
    public Set<String> unionDosConjuntos(Set<String> conjunto1,Set<String> conjunto2){
        subconjuntoMenor.clear();
        subconjuntoMenor.addAll(conjunto1);
        return subconjuntoMenor;
    }
    //Metodo para determinar si un conjunto esta contenido en otro.
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
    //Metodo que compara tres conjuntos y devuelve el conjunto mas grande.
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
    //Metodo para  retornar la variable string que contiene el nombre del conjunto mayor
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
