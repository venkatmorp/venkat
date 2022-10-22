package org.test;
public abstract class OppsConcept {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void poly(String name) {
    System.out.println("My Name is:"+name);
     }
	public void poly(int id) {
		System.out.println("My Id is:"+id);
	}
	public abstract void salary();
	
	public OppsConcept(String address) {
		System.out.println("My Place:"+address);
	}
}