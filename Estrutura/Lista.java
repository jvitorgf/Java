

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author jvitorgf
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = {5,84,544,2,564,22,151,1848,23,654,15,47};
        
        Arrays.sort(intArray);
        
        Pessoa Jose = new Pessoa("José",21);
        Pessoa Maria = new Pessoa("Maria",23);
        Pessoa Juca = new Pessoa("Juca",45);
        
        LinkedList<Pessoa> list = new LinkedList<>();
        list.addFirst(Jose);
        list.addFirst(Maria);
        
        for(Pessoa pessoa: list){
            System.out.println(pessoa);
        }
        System.out.println("");
        
        list.add(Juca);
         
        for(Pessoa pessoa: list){
            System.out.println(pessoa);
        }
        
        list.removeFirst();
        
        System.out.println("");
        for(Pessoa pessoa: list){
            System.out.println(pessoa);
        }
        
        list.removeLast();
        
        System.out.println("");
        for(Pessoa pessoa: list){
            System.out.println(pessoa);
        }
    }
    
}
