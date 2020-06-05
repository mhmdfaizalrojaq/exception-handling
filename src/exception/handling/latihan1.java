/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling;

/**
 *
 * @author HP14
 */
public class latihan1 {
    
}
class exc1 {
    public static void main (String [] args){
        int n = 0;
        try {
        n = System.in.read();
        }catch(java.io.IOException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println("hasil :" + (char) n);
    }
}
        // input : sinta
       //output : s