/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nangkum;

/**
 *
 * @author blyth
 */
public class tomyumgoong extends Ngangkum {
 
String tidtok ;

public void settidtok (String tidtok){
this.tidtok=tidtok;    
}
public String gettidtok (){
return tidtok;
} 

public tomyumgoong (String tabblenumber , String name, String tidtok, String rok5){
 this.tabblenumber=tabblenumber;
 this.food=food;
 this.tidtok=tidtok;
 this.rok5=rok5;
}

    public static void main(String[] args) {
        tomyumgoong lok =new tomyumgoong("teron" , "tomyumgoong" , "String rok3", "String rok5");
        lok.pringData();
        lok.settidtok("lok tidtok");
        
        System.out.println(lok.gettidtok());
        System.out.println(lok.getmember(25000));
    }
      
            
    
   
    }
    
    
    
    
    

