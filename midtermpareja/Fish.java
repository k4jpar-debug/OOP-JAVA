/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermpareja;

/**
 *
 * @author User
 */
public class Fish {

public object name ;
public object size ;
public object price ;

public Fish (object name, object size, object price){
    this.name = name;
    this.size = size;
    this.price = price;
    
}
    public Fish() {
       
 }
   
   @Override 
    public String toString(){
       String info = String.format("Name: %s \n"
               + "size: %.2f \n"
               + "Pieces: %.2f \n", name, size, price);
       return info;
         }
}                                                                                                           
    

   
        

    



