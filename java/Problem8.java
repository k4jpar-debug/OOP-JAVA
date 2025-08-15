/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pareja.java;

/**
 *
 * @author User
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //circle calculator 
        
        double radius = 7.5;
       
        //perimeter (circumreference) = 2 * π * r
        double  perimeter  = 2 * Math.PI * radius;
        
        //Area =  π * r^2 
        double area = Math.PI * radius * radius ;
        
        //print the result 
        System.out.println("perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
        
    }
    
}
