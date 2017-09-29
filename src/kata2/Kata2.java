/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        HashMap <Integer, Integer> histogram = new HashMap();
        // TODO code application logic here
        for (int value : data) {
            histogram.put(value, histogram.containsKey(value) ? histogram.get(value) + 1 : 1);
        }
        for(int key:histogram.keySet()){
            System.out.println(key + " -->" + histogram.get(key)+ " veces");
        
        }
        
    }
}
