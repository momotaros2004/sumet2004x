/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nangkum;

/**
 *
 * @author blyth
 */
public class Porklaab extends Ngangkum{
   String maitidtok ;

public void settidtok (String maitidtok){
this.maitidtok=maitidtok;    
}
public String getmaitidtok (){
return maitidtok;
} 

public Porklaab (String tabblenumber , String food, String maitidtok, String rok5){
 this.tabblenumber=tabblenumber;
 this.food=food;
 this.maitidtok=maitidtok;
 this.rok5=rok5;
}

    public static void main(String[] args) {
        Porklaab lok =new Porklaab("kapokhai" , "kapok" , "String rok3", "String rok5");
        lok.pringData();
        lok.settidtok("lok maitidtok");
        
        System.out.println(lok.getmaitidtok());
        System.out.println(lok.getmember(32000));
    }
      
            
    
   
   }
        
