package GenerationTree;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class TreeMapper {  // SingleTon
	Set<FamilyGroup> familyGroups;
	static  volatile TreeMapper instance = null;
	private TreeMapper() {
		familyGroups  = new HashSet<>();
	}
	public static TreeMapper  getInstance() {
		if(instance == null) {
			synchronized (TreeMapper.class) {
				if(instance == null) {
					instance = new TreeMapper();
				}
				
			}
		}
		
		return instance;
	}
	
	

	public void addNewMember(Scanner scanner) {
		System.out.println("Enter Family Name which you want to add New Member : ");
		String familyName = scanner.nextLine();
		FamilyGroup group = new FamilyGroup(familyName);
		FamilyGroup particularObject = isFamilyFound(group);
		
		if(!particularObject.equals(null)) {
			System.out.println("Enter Person Name : ");
			String name = scanner.nextLine();
			Relation.printRelation();
			System.out.println("Enter Relation : ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			Relation selectedRelation = Relation.getRelationByNumber(choice);
			if(selectedRelation == null) {
				System.out.println("Wrong RelationShip Try Again!");
				return;
			}
			Person newMember = new Member(name, selectedRelation);
			particularObject.addMember(newMember);
			return;
		}
			
		System.out.println(" No such Family Found");
			
		
		
	}
	
	private FamilyGroup isFamilyFound(FamilyGroup group) {
		for(FamilyGroup fgps : familyGroups) {
			if(fgps.getName().equals(group.getName())){
				return fgps;
			}
		}
		return null; // not found
		
	}
	public void displayFamilyName(Scanner scanner) {
		System.out.println("Enter Family Name which you want to display : ");
		String familyName = scanner.nextLine();
		FamilyGroup group = new FamilyGroup(familyName);
		
		Person particularObject = isFamilyFound(group);
		if(!particularObject.equals(null)) {
			particularObject.displayDetails();
			return;
		}
			
		System.out.println(" No such Family Found");
			
		
	}
	public  void createNewfamily(Scanner scanner) {
		System.out.println("Enter Family Name : ");
		String familyName = scanner.nextLine();
		FamilyGroup group = new FamilyGroup(familyName);
		familyGroups.add(group);
		System.out.println(group.getName()+ " SuccessFully Created");
		
	}
	public  void connectTwoFamilies(Scanner scanner) {
		
		System.out.println("Enter Superior  Family Name : ");
		String superiorFamilyName = scanner.nextLine();
		FamilyGroup superiorFamilyGroup = new FamilyGroup(superiorFamilyName);
		FamilyGroup particularObjectForSuperior = isFamilyFound(superiorFamilyGroup);
		if(particularObjectForSuperior.equals(null)) {
			System.out.println("No Such Family Found");
			return;
		}
		System.out.println("Enter Sub  Family Name : ");
		String subFamilyName = scanner.nextLine();
		FamilyGroup subFamilyGroup = new FamilyGroup(subFamilyName);
		FamilyGroup particularObjecForSubFamily = isFamilyFound(subFamilyGroup);
		if(particularObjecForSubFamily.equals(null)) {
			System.out.println("No Such Family Found");
			return;
			
		}
		particularObjectForSuperior.addMember(particularObjecForSubFamily);
		
		System.out.println("\nSuccess Linked two Family!");
	}

}
