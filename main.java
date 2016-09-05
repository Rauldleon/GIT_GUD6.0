

/* Universidad del valle de guatemala
* Autores
* Didier salazar 15487
* Raul DE Leon	15112
*Esteban Avalos 15059*/
package HDT6;
/*Clase principal del programa. controla las acciones que se realizaran */

/* Importaciones de librerias*/
import java.util.Scanner;
import java.util.Set;

/* main*/
public class main{
	public static void main(String args[]) {      
		/*variables*/	
		int op1 = 0;
		int op2 = 0;
		Scanner scan = new Scanner(System.in);
		boolean bool = false;
		boolean booli = false;
		/* instanciacion de la factory*/
		FactoryConjuntos fact = new FactoryConjuntos();
                boolean ciclePrincipal=false;
		while(ciclePrincipal==false){
		while(bool == false){
			/* SE IMPRIME LAS opciones*/
			System.out.println("Bienvenido al programa de operaciones, elija entre los siguientes tipos de conjuntos: ");
			System.out.println("1- HashSet");
			System.out.println("2- TreeSet");
			System.out.println("3- LinkedHashSet");
			System.out.println("4- Salir del programa");
			op1 = scan.nextInt();
			/* Verificacion de  la decision del usuario*/
			/* se imprime el mensaje de que escogio*/
			if(op1 == 1){
				System.out.print("Escogió conjuntos tipo HashSet \n");
                                bool=true;
			}
			else if(op1 == 2){
				System.out.print("Escogió conjuntos tipo TreeSet \n");
                                bool=true;
			}
			else if(op1 == 3){
				System.out.print("Escogió conjuntos tipo LinkedHashSet \n");
                                bool=true;
			}
			else if (op1 == 4){
                            System.out.println("Gracias por utilizar el programa :D");
				bool=true;
                                ciclePrincipal=true;
			}
			else{
				System.out.println("Error, ingrese bien los datos...");
			}
				
		}
/* se imprime para que el usuario ingrese el nombre */
      System.out.println("Ingrese a los desarrolladores: \n");
      boolean cicloSecundario = false;
      String desarrollador = "";
      Conjuntos conjuntoJava = new Conjuntos(op1);
      Conjuntos conjuntoWeb = new Conjuntos(op1);
      Conjuntos conjuntoCelulares = new Conjuntos(op1);
      boolean valida = true;
      
      while(cicloSecundario == false){
          System.out.println("Ingrese el Nombre del Desarollador: ");
          desarrollador = scan.next();
          /* se verifica que clase de desarrollador es y asi depende a cual se asigne*/
          /* se peide que indique y que ingrese 1 o 2 como si o no para indicar el tipo*/
          valida = false;
          while( valida == false){
          System.out.println("¿Desarrolla en Java?");
          System.out.println("1. Si.");
          System.out.println("2. No.");
          op2=scan.nextInt();
           if(op2==1){
              conjuntoJava.setTable(desarrollador);
              valida = true;
             } 
           else{
                if(op2==2){
                    valida = true;
                }
                else{
                    System.out.println("Error, reingrese la opción elegida.");
                }
           } 
          }
          valida = false;
          while( valida == false){
          System.out.println("¿Desarrolla con lenguaje de aplicaciones Web?");
          System.out.println("1. Si.");
          System.out.println("2. No.");
          op2=scan.nextInt();
           if(op2==1){
              conjuntoWeb.setTable(desarrollador);
              valida = true;
             } 
           else{
                if(op2==2){
                    valida = true;
                }
                else{
                    System.out.println("Error, reingrese la opción elegida.");
                }
           }
          }
          
          valida = false;
          while( valida == false){
          System.out.println("¿Desarrolla para Celulares?");
          System.out.println("1. Si.");
          System.out.println("2. No.");
          op2=scan.nextInt();
           if(op2==1){
              conjuntoCelulares.setTable(desarrollador);
              valida = true;
             } 
           else{
                if(op2==2){
                    valida = true;
                }
                else{
                    System.out.println("Error, reingrese la opción elegida.");
                }
           }
           
          }
          valida = false;
          while( valida == false){
          System.out.println("¿Desea ingresar otro desarrollador?");
          System.out.println("1. Si.");
          System.out.println("2. No.");
          op2=scan.nextInt();
           if(op2==1){
              valida = true;
             } 
           else{
                if(op2==2){
                    valida = true;
                    cicloSecundario = true;
                }
                else{
                    System.out.println("Error, reingrese la opción elegida.");
                }
           }
          } 
        }  
    
/* Parte de impresion de los tipos de desarrolladores que el usuario ingreso, por los distintos conjuntos que se pueden crear*/
        System.out.println("******************************");
              Set conjuntoResultante1=conjuntoJava.getConjunto();
              Set conjuntoResultante2=conjuntoWeb.getConjunto();
              Set conjuntoResultante3=conjuntoCelulares.getConjunto();
              Set conjuntoMayor=conjuntoJava.conjuntoMasGrande(conjuntoResultante1, conjuntoResultante2, conjuntoResultante3);
              System.out.println("1. Los desarrolladores con experiencia en java, web y celulares son: ");
            
              System.out.println(conjuntoJava.interseccionTresConjuntos(conjuntoResultante1,conjuntoResultante2,conjuntoResultante3));
            
              System.out.println("2. Los desarrolladores con experiencia en Java pero que no tienen experiencia en aplicaciones web son: ");
              System.out.println(conjuntoJava.inclusionAB(conjuntoResultante2,conjuntoResultante3));
            
              System.out.println("3. Los desarrolladores con experiencia en Web y Celuares, pero que no tienen experiencia en java son: ");
              System.out.println(conjuntoJava.inclusionAB(conjuntoWeb.interseccionDosConjuntos(conjuntoResultante2,conjuntoResultante3), conjuntoResultante1));
              System.out.println("4. Los desarrolladores con experiencia en Web o Celuares, pero que no tienen experiencia en java son: ");
              System.out.println(conjuntoJava.inclusionAB(conjuntoWeb.unionDosConjuntos(conjuntoResultante2, conjuntoResultante3),conjuntoResultante1));
             
              if (conjuntoJava.subConjuntoAmbos(conjuntoResultante1, conjuntoResultante3)==true){
                  System.out.println("5. El conjunto de desarrolladores java es un subconjunto de Desarrolladores Web.");
              }
              else{
                  System.out.println("5. El conjunto de desarrolladores java no es un subconjunto de Desarrolladores Web.");
              }
            
              System.out.println("6. El mas grande es: "+conjuntoJava.getConjuntoMayor() );
              System.out.println(conjuntoJava.conjuntoMasGrande(conjuntoResultante1, conjuntoResultante2, conjuntoResultante3));
           
               System.out.println("7. Lista de nombres de "+conjuntoJava.getConjuntoMayor()+" en orden ascendente: ");
              System.out.println(conjuntoJava.getStringConjunto(conjuntoWeb.conjuntoMasGrande(conjuntoResultante1, conjuntoResultante2, conjuntoResultante3)));
              System.out.println(conjuntoResultante1);
              System.out.println(conjuntoResultante2);
              System.out.println(conjuntoResultante3);
bool=false;
    }	
	}

}
