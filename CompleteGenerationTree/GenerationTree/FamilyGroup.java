package GenerationTree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class FamilyGroup implements Person{
	private Set<Person> familyMemberDetails;
	private String familyName = null;
	public FamilyGroup(String nameForFamily) {
		this.familyName = nameForFamily;
		familyMemberDetails = new LinkedHashSet<>();
	}
	
	public void addMember(Person person) {
		familyMemberDetails.add(person);
		System.out.println(person.getName() +" added to "+ familyName);
	}
	
	public void removeMember(Person person) {
		if(familyMemberDetails.contains(person)) {
			familyMemberDetails.remove(person);
			System.out.println("Removed from Family : "+familyName);
		}
		else {
			System.out.println("No Such Person exists in this Family : "+ familyName);
		}
	}
	
	

	@Override
	public void displayDetails() {
		System.out.println("---------------------------------\n");
		System.out.println("\tFamily Name : "+familyName+"\n");
		
		for(Person person : familyMemberDetails) {
			person.displayDetails();
		}
		System.out.println("-------------------------------\n");
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return familyName;
	}
	

}