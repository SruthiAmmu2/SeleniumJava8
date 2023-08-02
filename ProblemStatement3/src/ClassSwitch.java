import java.util.Scanner;


public class ClassSwitch {

	
	public static void main(String[] args) {
		
     int choice = 0;
     
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the Card Number selected by Jill");
     choice = in.nextInt();
     
     switch(choice)
     {
     case 1: 
    	 System.out.println("The number you entered was " + choice );
		 System.out.println("Honesty makes better Friends than Flattery");
	     break;
    	 
     case 2: 
    	 System.out.println("The number you entered was " + choice );
		 System.out.println("Time and Tide waits for No Man");
	     break;
     
     case 3: 
    	 System.out.println("The number you entered was " + choice );
		 System.out.println("Where there is a Will, There is a way");
	     break;
	 
     case 4: 
    	 System.out.println("The number you entered was " + choice );
		 System.out.println("Great Idea start out as crazy ones");
	     break;
     
     case 5: 
    	 System.out.println("The number you entered was " + choice );
		 System.out.println("The most Pleasant Smile is Your Own");
	     break;
	 
     case 7: 
    	 System.out.println("The number you entered was " + choice );
		 System.out.println("Adversity Opens Your Eyes");
	     break;
	     
     case 8: 
    	 System.out.println("The number you entered was " + choice );
		 System.out.println("Happy Day!!!");
	     break;
	     
     case 9: 
    	 System.out.println("The number you entered was " + choice );
		 System.out.println("There is no true change without Pain");
	     break;
	     
     case 10: 
    	 System.out.println("The number you entered was " + choice );
		 System.out.println("Silence is often the most eloquent response");
	     break;
	     
     default:
			System.out.println("You have entered a wrong Choice. Please try Again ");
     }
     
	}

}
