package Ejercicio;

import java.util.ArrayList;
import java.util.List;

/*
 * Dados n pares de paréntesis, implementa un algoritmo para generar todas las combinaciones
 * válidas de paréntesis.
 *
 * Ejemplo 1:
 *  Input:
 *    n: 1
 *  Output:
 *    ["()"]
 *
 * Ejemplo 2:
 *  Input:
 *    n: 3
 *  Output:
 *    ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 * Se debe usar StringBuilder
 */
public class EjercicioDos {

    public List<String> generateParenthesis(int n) {
        
        List<List<String>> dp=new ArrayList<>();
        dp.add(new ArrayList<>());
        dp.get(0).add("");
        for(int i =1;i<=n;i++){
            List<String> set2=new ArrayList<>();
            for(int j=0;j<i;j++){
                List<String>primer=dp.get(j);
                List<String>segundo=dp.get(i-1-j);
                for(String x:primer){
                    for(String x2:segundo){
                        set2.add("("+x+")"+x2);
                    }
                }
                
            }
            dp.add(set2);
        }
        return dp.get(n);
        
    }
}
