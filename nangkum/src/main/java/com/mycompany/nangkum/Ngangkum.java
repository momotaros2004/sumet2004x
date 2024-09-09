/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nangkum;

/**
 *
 * @author blyth
 */
public class Ngangkum implements in {

public String tabblenumber;
public String food;
public final double member =1.05;
public String rok4;
public String rok5;

public void food1 (){
    this.food=null;
}

public void food2 (){
    this.food=null;
}
public void settabblenumber (String tabblenumber){
this.tabblenumber=tabblenumber;    
}
public void setfood (String food){
this.food=food;    
}
public String gettabblenumber (){
return this.tabblenumber; 
}
public String getfood (){
return this.food; 

} 
public double getmember (double discount){
return (discount*member);   
}
    public void pringData(){
    System.out.println("tabblenumber = " + this.tabblenumber);
    System.out.println("food = " + this.food);
}
        

}       
      
        
        
        
        
