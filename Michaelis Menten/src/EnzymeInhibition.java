import java.util.Scanner;

public class EnzymeInhibition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inhibitionTypes = { "No inhibition", "Competitive", "Mixed High E Aff", "Noncompetitive",
				"Mixed High ES Aff", "Uncompetitive" };
		for(int number = 0; number< inhibitionTypes.length; number++) {
			System.out.println(number + " - " + inhibitionTypes[number]);
		}
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter the inhibition type: ");
		int type = reader.nextInt();
		
		System.out.println(inhibitionTypes[type] + " selected.");
		reader.close();
	}

}
