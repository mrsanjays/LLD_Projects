import FamilyTree.FamilyGroup;
import FamilyTree.Member;
import FamilyTree.Person;

public class MainForFamilyTree {
	
	public static void main(String[] args) {
		
		Person grandFa = new Member("Grandi ", "Grand Father");
		Person grandMa = new Member("Granni", "Grand Mom");
		Person father = new Member("Strict Officer","Father");
		Person mother = new Member("CareTaker", "Mother");
		Person son1 = new Member("FirstSucess", "Son");
		Person daughter1 = new Member("Second Sucess", "Daughter");
		
		FamilyGroup myFamily = new FamilyGroup("My Family");
		myFamily.addMember(father);
		myFamily.addMember(mother);
		myFamily.addMember(son1);
		myFamily.addMember(daughter1);
		
		myFamily.displayDetails();
		
		FamilyGroup myFamilyWithGrandFaMA = new FamilyGroup("LongLive");
		myFamilyWithGrandFaMA.addMember(grandFa);
		myFamilyWithGrandFaMA.addMember(grandMa);
		myFamilyWithGrandFaMA.addMember(myFamily);
		
		myFamilyWithGrandFaMA.displayDetails();
		
		
	}

}
