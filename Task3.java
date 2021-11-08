/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author AL-Motahida
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        baseball b=new baseball();
        b.baseball("ahmed");
        System.out.println(b.getBrandName());
        football a=new football();
        a.football("ahmed mohamed");
        System.out.println(a.getBrandName());
        
        ball d=new ball();
        d.toss();
        a.toss();
       
        
    }
    
}
