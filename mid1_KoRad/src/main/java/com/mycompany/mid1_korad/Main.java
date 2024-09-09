/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mid1_korad;

/**
 *
 * @author blyth
 */
public class Main {
    public static void main(String[]args){
        Mid1_KoRad p1 = new Mid1_KoRad("001");
        p1.setID("001");
        p1.setName("Sumet");
        p1.setAge(20);
        p1.setSalary(30000.0);
        p1.displayMid1_KoRad();
        
       Mid1_KoRad p2 = new Mid1_KoRad();
        p2.setID("002");
        p2.setName("Somchai");
        p2.setAge(19);
        p2.setSalary(40000.0);
        p2.displayMid1_KoRad();
        
        Mid1_KoRad p3 = new Mid1_KoRad();
        p3.setID("003");
        p3.setName("somsi");
        p3.setAge(30);
        p3.setSalary(50000.555);
        p3.displayMid1_KoRad();
        
        Mid1_KoRad p4 = new Mid1_KoRad();
        p4.setID("004");
        p4.setName("sommai");
        p4.setAge(27);
        p4.setSalary(45000.99);
        p4.displayMid1_KoRad();
    }
}