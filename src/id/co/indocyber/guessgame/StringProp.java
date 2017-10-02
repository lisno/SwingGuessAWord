/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame;

/**
 *
 * @author user
 */
public class StringProp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = "Matt Robinson";
        char[] vokal = {'a','i','u','e','o'};
        
        for (int i = 0; i < vokal.length; i++) {
           nama = nama.replace(vokal[i], '_'); 
        }
        
        System.out.println(nama);
        
        
//        char idx5 = nama.charAt(5);
//        System.out.println("idx5");
//        
//        int uni5 = nama.codePointAt(5);
//        System.out.println(uni5);
        
        
    }
    
}
