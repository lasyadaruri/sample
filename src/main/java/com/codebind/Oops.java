package com.codebind;

public class Oops {
	public static void main(String args[]) {
		gifts w=new chocolates("dairymilk","munch",10,20);
		gifts p=new sweets("laddu","mysorepak",20,30);
		
		w.weight();
		p.weight();
		
		w.display();
		p.display();
	    }
	
	
}
abstract class gifts {
	int cost1;
	int cost2;
	abstract void weight();
	public gifts(int cost1,int cost2) {
		this.cost1=cost1;
		this.cost2=cost2;
	}
	public void display() {
		System.out.println("all the gifts are received");
		
	}

}

class chocolates extends gifts{
	String choco1;
	String choco2;
	
	 public chocolates(String choco1,String choco2,int cost1,int cost2) {
		 super(cost1,cost2);
		 this.choco1=choco1;
		 this.choco2=choco2;
		 
	 }
	 public void display() {
		 super.display();
		  System.out.println("chocolates are:"+choco1+" ,"+choco2);
	 }
	 public void weight() {
		 System.out.println( cost1+cost2);
	 
	 }
	 }
class sweets extends gifts{
	String s1;
	String s2;
	
	
	public sweets(String s1,String s2,int cost1,int cost2) {
		super(cost1,cost2);
		this.s1=s1;
		this.s2=s2;
		
	}
	public void display() {
		System.out.println("sweets are:"+s1+", "+s2);
	}
	
	public void weight() {
		System.out.println( cost1+cost2);
		
		
	}
}

