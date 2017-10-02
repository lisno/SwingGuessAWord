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
public abstract class IPrinter {
 
    private int jumlahTinta = 2; 
   
    public void printme() {
        System.out.println("Jumlah tinta: " + jumlahTinta);
    }
  
    public abstract void implementMe();
    
}
