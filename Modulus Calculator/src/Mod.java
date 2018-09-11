import java.util.Scanner; 
// convert this into a GUI 
public class Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice = 100;
		double x = 100000; 
		double y = 0; 
		double result = 0; 
		Scanner s = new Scanner(System.in); 
		

		// program termination code == 3
		while(choice!=3)
		{
		
		System.out.println("1) Grade Calculator "); 
		System.out.println("2) Mod Calculator [Used for CS 3445] " ); 
		System.out.println("3) Exit "); 
		

		choice = s.nextInt(); 
		if(choice == 1) { gradeC();}
		if(choice == 2) { modC(); }
		if(choice == 0) { secretgradeform();}
		
	
		
	
		System.out.println("goodbye!");
		
		
		}
	}
	
	public static void secretgradeform()
	{
		Scanner s = new Scanner(System.in); 

		double weight1 = 30; 
		double weight2 = 40; 
		double weight3 = 30; 
		
		double x1 = (8/60)*(weight1); // exam 1 lock 
		
	
		System.out.println("score for weight 2:");
		gradeC(); 
		double score2; 
		System.out.println("score for weight 2:");
		score2 = s.nextDouble(); 
		System.out.println("score for weight 3:");
		double s3 = s.nextDouble(); 
		double finne = (s3)*(weight3);
		
		double quiz = score2 * (weight2); 
		
		
		double fin = x1 + quiz + finne;
		
		System.out.println("final score: " + fin);
	}
	
	public static void gradeC()
	{
		
		Scanner s = new Scanner(System.in); 
		
		System.out.println("grade calculation:");
		System.out.println("Enter # of grades to input:");
		double qsize = s.nextInt();
		System.out.println("Enter weight:");
		double weight = s.nextInt(); 
		System.out.println("enter grades consecutively:");
		
		double total = 0; 
		double in = 0; 
		for(int i = 0; i< qsize; i++)
		{
			System.out.println("Slot:" + (i+1)); 
			in = s.nextDouble(); 
			total+=in;

		
		}
		
		double weight2 = weight/100; 
		double average = total/qsize; 
		
		System.out.println("Input Average: " + (average) + "%");
		System.out.println("Points to final: " + average*weight2); 
		
		
	
	}
	
	public static void modC()
	{
		Scanner s = new Scanner(System.in); 

		double x = 100000; 
		double result = 0; 
		double y = 0; 
		System.out.println("enter mod size:"); 
		y = s.nextInt(); 
		
		System.out.println("0 to Exit"); 
		while(x!=0)
		{
			
			System.out.println("Enter x:"); 
			x = s.nextInt(); 
			result = x%y; 
			
			System.out.println(result); 
	
			
			
			
	    }
		
		
	}

}
