package FamilyTree;

public class Member implements Person {
	private String nameOfMember;
	private String relation;
	public Member( String name,String relation) {
		// TODO Auto-generated constructor stub
		this.nameOfMember = name;
		this.relation = relation;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.print("Member name -> "+ nameOfMember +" | "+ "Relation -> "+relation);
		System.out.println();
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nameOfMember;
	}

}
