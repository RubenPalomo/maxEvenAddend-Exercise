import java.io.*;
import java.util.*;

class Result {
    public static long getMaximumEvenSum(List<Integer> val) {
        long result = 0;
        long aux = -9223372036854775808L;
        
        Collections.sort(val);
        for (int i = 0; i < val.size(); i++) {
            if (val.get(i) > 0)
                result += val.get(i);
        }
        
        if (result % 2 == 0)
            return result;
            
        for (int i = 0; i < val.size(); i++) {
            if (val.get(i) < 0 && (result + val.get(i)) % 2 == 0 && aux < (result + val.get(i))) {
                aux = result + val.get(i);
            }
            else if (val.get(i) > 0 && (result - val.get(i)) % 2 == 0 && aux < (result - val.get(i))) {
                aux = result - val.get(i);
            }
        }
        result = aux;
        return result;
    }
}
