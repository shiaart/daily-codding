package p1;

import java.util.Arrays;
import java.util.List;


public class app {
    public static void main(String[] args){
        Integer[] ar = {10, 15, 3, 7};
        List<Integer> arInt = Arrays.asList(ar);
        int k = 18;
        boolean hasMatch = false;
        for(int i=0;i< arInt.size();i++){
            hasMatch = arInt.indexOf(k - ar[i]) >= 0;
            if(hasMatch) break;
        }

        System.out.println(hasMatch);
    }
}
