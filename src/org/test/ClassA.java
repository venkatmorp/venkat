package org.test;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClassA extends OppsConcept {
	@Override
	public void salary() {
   System.out.println("My Salary is:75000");		
	}
	public ClassA(int rollNo){
	this(9876543210l);
    System.out.println("My RollNo:"+rollNo);
    }
	public ClassA(long Phnno){
	super("Coimbatore");
    System.out.println("My PhnNo:"+Phnno);	
	}
	public static void main(String[] args) {
		ClassA c = new ClassA(9876);
		c.poly(98765);
		c.poly("Murugan");
		c.setAge(28);
		int text = c.getAge();
		System.out.println("My Age is:"+text);
   
	Map<String,String> l = new LinkedHashMap<>();
		l.put("company","Infosys");
		l.put("CompId","67201");
		
	Set<Entry<String, String>> entry = l.entrySet();	
		for (Entry<String, String> entry2 : entry) {
			System.out.println(entry2);
			}
		}
}