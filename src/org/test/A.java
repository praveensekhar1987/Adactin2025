package org.test;

public class A  {
	public A() {
	    this("JAVbA");
	    //this("JAVb");
	    //System.out.println("Default const...");
	  }

	  public A(int id) {
		    this(3456.5678f);
		    System.out.println(id);
		  }

	  public A(float sal) {
		  //this(9.0f);
	    System.out.println(sal);
	  }

	  public A(String name) {
	    this(12);
	    System.out.println(name);
	  }
	  

	  public static void main(String[] args) {
	    A a = new A();
	  }

}
