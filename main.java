import java.util.Scanner;

public class main{
	public static void main(String args[]) {      
		int op1 = 0;
		int op2 = 0;
		Scanner scan = new Scanner(System.in);
		boolean bool = false;
		boolean booli = false;
		Factory fact = new Factory();
		
		while(bool == false){
			System.out.println("Bienvenido al programa de operaciones, elija entre los siguientes tipos de conjuntos: ");
			System.out.println("1- HashSet");
			System.out.println("2- TreeSet");
			System.out.println("3- LinkedHashSet");
			System.out.println("4- Salir del programa");
			op1 = scan.nextInt();
			
			if(op1 == 1){
				
			}
			else if(op1 == 2){
				
			}
			else if(op1 == 3){
				
			}
			else if (op1 == 4){
				
			}
			else{
				System.out.println("Error, ingrese bien los datos...");
			}
			
			
		}
			
		
	}
}
