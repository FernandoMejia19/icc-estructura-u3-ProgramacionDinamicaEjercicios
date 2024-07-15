package Ejercicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 * 
 * El  metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios metodos 
 * 
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 */
public class EjercicioUno {

     public List<List<Integer>> subsets(List<Integer> set) {
        List<List<Integer>> set2=new ArrayList<List<Integer>>();
        set2.add(new ArrayList<Integer>());
        for(Integer x:set){
            addSetByElement(x,set2);
        }
        set2.add(set);
        return set2;
  }

    private void addSetByElement(Integer x, List<List<Integer>> set2) {
        int currentSize=set2.size();
        for(int i=0;i<currentSize;i++){
            List<Integer>newSubject=new ArrayList<Integer>(set2.get(i));
            newSubject.add(x);
            set2.add(newSubject);
        }
    }
}
