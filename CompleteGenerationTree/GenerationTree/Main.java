package GenerationTree;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		int nextOp = 1;
		Scanner scanner = new Scanner(System.in);
		TreeMapper obj  = TreeMapper.getInstance();
		
		 do{
			System.out.println(" 1 to add create new Family : ");
			System.out.println(" 2 to add new Member to Family");
			System.out.println(" 3 to Display Family ");
			System.out.println(" 4 to Add one Family to Other Family");
			System.out.println(" 9 to exit");
			nextOp = scanner.nextInt();
			scanner.nextLine();
			switch (nextOp) {
			case 2:
				obj.addNewMember(scanner);
				break;
			case 1:
				obj.createNewfamily(scanner);
				break;
			case 3:
				obj.displayFamilyName(scanner);
				break;
			case 4:
				obj.connectTwoFamilies(scanner);
				break;
			case 9:
				System.out.println("Thank you !");
				break;
				
			default:
				break;
			}
		}while(nextOp != 9);
		
	}
	
}
