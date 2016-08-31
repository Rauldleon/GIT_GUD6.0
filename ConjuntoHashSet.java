import java.lang.reflect.Array;
import java.util.*;

public class ConjuntoHashSet<T> extends ConjuntoAbs<T> {

	HashSet hash = new HashSet();
	
	@Override
	public void agregarDesarrollador(T desarrollador) {
		// TODO Auto-generated method stub
		hash.add(desarrollador);
		
	}

	@Override
	public void compararDesarrollador(T desarrollador) {
		// TODO Auto-generated method stub
		Array ari = new Array();
		hash.toArray();
	}
	
}
