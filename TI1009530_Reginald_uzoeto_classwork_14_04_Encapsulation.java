/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulation_abstraction_polymorphism;

/**
 *
 * @author Chinaza
 */
class Employee
{
    
  private int empno;
  private String name;
  private double salary;
  
  public int getempno()
  {
      return empno;
  }
  
  public String getname()
  {
      return name;
  }
  
  public double  getsalary()
  {
      return salary;
  }
  
  public void setempno(int a)
  {
      empno=a;
  }
  
  public void setname(String b)
  {
      name=b;
  }
  public void setsalary(int c)
  {
      salary=c;
  }
}

class StaffPersonalDetails {
    private String address;
    private int phoneNo;
    private String gender;
    
    public void setaddress(String address)
    {
        this.address=address;
    }
    
    public String getaddress()
    {
        return address;
    }
    
    public void setphoneNo(int phoneNo)
    {
        this.phoneNo=phoneNo;
    }
    
    public int getphoneNo()
    {
        return phoneNo;
    }
    
     public void setgender(String gender)
    {
        this.gender=gender;
    }
    
    public String getgender()
    {
        return gender;
    }
}
public class Encapsulation {
    
    public static void main(String[] args)
    {
        Employee empl =new  Employee();
        StaffPersonalDetails pdetail=new StaffPersonalDetails();
        empl.setempno(52145);
        empl.setname("John");
        empl.setsalary(1000000);
        pdetail.setgender("Male");
        pdetail.setaddress("Montreal");
        pdetail.setphoneNo(562339888);
        System.out.println("Employee No:"+empl.getempno()+"\tEmployee Name:"
                +empl.getname()+"\tEmployee salary:"+empl.getsalary());
        System.out.println("Employee Gender:"+pdetail.getgender()+"\tEmployee Addr:"
                +pdetail.getaddress()+"\tEmployee Phone:"+pdetail.getphoneNo());
        empl.setempno(65214);
        empl.setname("David");
        empl.setsalary(250000);
        pdetail.setgender("Male");
        pdetail.setaddress("Toronto");
        pdetail.setphoneNo(45629888);
        System.out.println("Employee No:"+empl.getempno()+"\tEmployee Name:"
                +empl.getname()+"\tEmployee salary:"+empl.getsalary());
        System.out.println("Employee Gender:"+pdetail.getgender()+"\tEmployee Addr:"
                +pdetail.getaddress()+"\tEmployee Phone:"+pdetail.getphoneNo());
        
    }
    
    
}
