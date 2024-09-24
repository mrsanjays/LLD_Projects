package GenerationTree;


public class Member implements Person {
	private String nameOfMember;
	private Relation relationType;
	public Member( String name,Relation type) {
		// TODO Auto-generated constructor stub
		this.nameOfMember = name;
		this.relationType = type;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.print("Member name -> "+ nameOfMember +" | "+ "Relation -> "+ relationType);
		System.out.println();
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nameOfMember;
	}

}
