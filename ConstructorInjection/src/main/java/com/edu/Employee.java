package com.edu;

public class Employee 
{
 int id;
 String name;
 double sal;
public Employee(int id, String name,double sal) 
{
	super();
	this.id = id;
	this.name = name;
	this.sal=sal;
}
public void diplay()
{
	System.out.println("Employee id is:"+id);
	System.out.println("Employee name is:"+name);
	System.out.println("Employee salary is:"+sal);
}
 
}
