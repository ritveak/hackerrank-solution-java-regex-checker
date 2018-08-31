package regex_checker;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	try{Pattern p= Pattern.compile(pattern);}
          	catch(NumberFormatException nfe) {System.out.println("Invalid"); break;}
          	catch(PatternSyntaxException pse){System.out.println("Invalid"); continue;}
          	System.out.println("Valid");
            
		}
	}

}
