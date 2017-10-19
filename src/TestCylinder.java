import java.util.Scanner;

public class TestCylinder {
	
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		
		int userSelection;
		do {
	    // Display menu graphics
	    System.out.println("============================");
	    System.out.println("|        SELECTION         |");
	    System.out.println("============================");
	    System.out.println("| Options:                 |");
	    System.out.println("| 1. Create a Circle       |");
	    System.out.println("| 2. Create a Cylinder     |");
	    System.out.println("| 3. Exit                  |");
	    System.out.println("============================");
	    
	   // keyboard = new Scanner(System.in);
	    System.out.print("Select option: ");
	    userSelection = keyboard.nextInt();
	    
	    switch (userSelection) {
	    case 1:
			enterCircleParam();
	      break;
	    case 2:
			enterCylinderParam();
	      break;
	    case 3:
	      System.out.println("\nPROGRAM TERMINATED");
	      break;
	    default:
	      System.out.println("Invalid selection");
	      break; // This break is not really necessary
	    }
		}while(userSelection!=3);
	    

	}

	private static void enterCylinderParam() 
	{
		System.out.print("Enter Cylinder radius:	");
	      double radiusC = keyboard.nextDouble();
	      keyboard.nextLine();
	      System.out.print("Enter Cylinder color:	");
	      String colorC = keyboard.nextLine();
	      System.out.print("Enter Cylinder height:	");
	      double height = keyboard.nextDouble();
	      Cylinder cylinder = new Cylinder (radiusC,colorC,height);
	      System.out.println(cylinder);
	}

	private static void enterCircleParam() 
	{
		System.out.print("Enter Circle radius:	");
	      double radius = keyboard.nextDouble();
	      System.out.print("Enter Circle color:	");
	      keyboard.nextLine();
	      String color = keyboard.nextLine();
	      Circle circle = new Circle (radius,color);
	      System.out.println(circle);
	}
	
	

}
