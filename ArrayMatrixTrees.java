package def;
import java.util.Scanner;

public class ArrayMatrixTrees {
	
	static void hPyrRight(int userNum) {
		for (int i = 1; i <= userNum; i++) {
			// Print asterisks
	        for (int j = 0; j < i; j++) {
	            System.out.print("* ");
	        }
	        // Print spaces 
	        for (int j = 0; j < userNum - i; j++) {
	            System.out.print("  ");
	        }
	        System.out.println();
	    }
	}
	static void hPyrLeft(int userNum) {
		for (int i = 1; i <= userNum; i++) {
			// Print spaces 
	        for (int j = 0; j < userNum - i; j++) {
	            System.out.print("  ");
	        }
			// Print asterisks
	        for (int j = 0; j < i; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
	static void fullPyr(int userNum) {
		
	}
	static void ihPyrRight(int userNum) {
		
	}
	static void ihPyrLeft(int userNum) {
		
	}
	static void iFullPyr(int userNum) {
		
	}

	public static void main(String[] args) {
		
		//variable initialization
		Scanner scan = new Scanner(System.in);

		//user input
		System.out.println("Welcome!");
		System.out.println("Enter your birth month (number):");
		int userNum = scan.nextInt();
		
		
		System.out.println("1) Half Pyramid (right)");
		System.out.println("2) Half Pyramid (left)");
		System.out.println("3) Full Pyramid");
		System.out.println("4) Inverted Half Pyramid (right)");
		System.out.println("5) Inverted Half Pyramid (left)");
		System.out.println("6) Inverted Full Pyramid\n");
		System.out.println("Enter (number) which kind of pyramid you would like to see: ");
		int whichPyr = scan.nextInt();
		
		switch(whichPyr) {
			case 1: hPyrRight(userNum); break;
			case 2: hPyrLeft(userNum); break;
			case 3: fullPyr(userNum); break;
			case 4: ihPyrRight(userNum); break;
			case 5: ihPyrLeft(userNum); break;
			case 6: iFullPyr(userNum); break;
			default : 
				do {
					System.out.println("Please choose a valid option.");
					System.out.println("Enter (NUMBER) which kind of pyramid you would like to see: ");
					whichPyr = scan.nextInt();
				} while (whichPyr <6 || whichPyr >1); 
				break;
		}
	}
}
