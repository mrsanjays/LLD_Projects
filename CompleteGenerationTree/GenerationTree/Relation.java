package GenerationTree;

public enum Relation {
	GRANDFA(1),
	GRANDMA(2),
	DAD(3),
	MOM(4),
	UNCLE(5),
	AUNT(6),
	MYSELF(7),
	BROTHER(8),
	SISTER(9);
	
	private final int number;
	private Relation(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public static void printRelation() {
		for(Relation relation : Relation.values()) {
			System.out.println(relation.getNumber() + " Relation -> " + relation);
		}
	}
	public static Relation getRelationByNumber(int number) {
		for(Relation relation : Relation.values()) {
			if(relation.getNumber() == number) {
				return relation;
			}
		}
		
		return null;
		
	}
	
	
}
