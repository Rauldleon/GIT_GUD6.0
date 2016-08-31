import java.util.*;

public class Factory {
	public ConjuntoAbs setConjunto(int opcion){
	
		if(opcion == 1){
			return new ConjuntoHashSet();
		}
		else if(opcion == 2){
			return new ConjuntoTreeSet();
		}
		else{
			return new ConjuntoLinkedHashSet();
		}
	}
}
