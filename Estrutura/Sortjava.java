
import java.util.Arrays;

/**
 *
 * @author jvitorgf
 */
public class Sortjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = {5,84,544,2,564,22,151,1848,23,654,15,47};
        
        Arrays.sort(intArray);
        
        
        for(int i = 0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
    
}
