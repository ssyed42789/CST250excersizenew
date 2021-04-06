/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst250excersizenew;

/**
 *
 * @author ssyed
 */
public class CST250excersizenew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        long start;
        long end;
        long duration;
        
        
        for(int i = 0; i<10; i++){
        start = System.nanoTime();
        sumToN_1(5);
        end = System.nanoTime();
        duration = end - start;
        System.out.println(i + " - Duration of running implementation 1:" + duration + "nano seconds.");
            
        }
        
    }
    public static int sumToN_1(int n ){
        int sum = 0;
        
        for(int i = 1; i<n+1; i++){
            sum = sum + i;
        }
        return sum;
    }
     public static int sumToN_2(int n ){
         int sum = (n* (n+1))/2;
         return sum;
     }
    

    
}
