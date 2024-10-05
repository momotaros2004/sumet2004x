/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student_67;

/**
 *
 * @author 6652100631 Sumet samanthai
 */
class Student_67 {
  //---------------Attribute--------------------
  public String id_student ="6652100746"; 
  public String Fn_name ="Sumet";
  public String Sn_name ="Samanthai";  
  
  //---------------Method--------------------------- 
  public void setld( String id){ 
      id = id_student; 
  } //method type void
  public void oopld( String fn){ 
      fn = Fn_name; 
  } 
   public void sellld( String sn){ 
      sn = Sn_name;
  } 
  public String getid(){
      return id_student;
  } //method not void
  public String get1id(){
      return Fn_name;
  } 
  public String get2id(){
      return Sn_name;
  } 
  
  
    public static void main(String[] args) {
        Student_67 stu = new Student_67();
        Student_67 stu1 = new Student_67();
         Student_67 stu2 = new Student_67();
        
        stu.setld("yy");
        stu1.oopld("plopl,");
        stu2.sellld("pppppp");
        
        stu.getid();
        stu1.get1id();
        stu2.get2id();
        
        System.out.println("Id::"+stu.getid()+" "+stu1.get1id()+" "+stu2.get2id());
        
    }//----------end main-------------
}//--------------end class-------------