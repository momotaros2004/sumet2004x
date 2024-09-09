/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mid1_korad;

/**
 *
 * @author blyth
 */
public class Mid1_KoRad {
    
    public  String id;
    public String name;
    public int age;
    public double salary;
    

    public Mid1_KoRad() {
        this.id=null;
        this.name=null;
        this.age=0;
        this.salary=0;
    }
    public Mid1_KoRad(String id){
        this.id=id;
        
    }
    public Mid1_KoRad(String id , String name){
       this.id=id;
       this.name=name;
    }
     public Mid1_KoRad(String id , String name , int age , double salary){
       this.id=id;
       this.name=name;
       this.age=age;
        this.salary=salary;
    }
    
    public void setID (String id){
        this.id=id;
        displayMid1_KoRad();
    }
    public void setName (String name){
        this.name=name;
    }
    public void setAge (int age){
        this.age=age;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void displayMid1_KoRad(){
        System.out.println("ID : "+this.id);
        System.out.println("NAME : "+this.name);
        System.out.println("AGE : "+this.age);
        System.out.println("SALARY : "+this.salary);
        System.out.println("---------------------");
    }
    public String getID (){
       return this.id; 
    }
    public String getNAME(){
        return this.name;
    }
    public int getAGE(){
        return this.age;
    }
    public double getSALARY(){
        return this.salary;
    }
}


