/**
 * Created with IntelliJ IDEA.
 * User: Maxwell
 * Date: 11/4/13
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;

public class Question10Main {
	
	private static CommandParser commandParser = new CommandParser();
	public static boolean stillRunning = true;
	
	public static void main (String[] args){
		run();
	}
	
	public static void run(){
		while(stillRunning == true){
			 Scanner scanInput = new Scanner(System.in);
		     String input = scanInput.nextLine();
		     
		     //Added an exit feature just because
		     //To many processes end up running
		     if(input.equals("exit")){
		    	 System.out.println("Closing");
		    	 scanInput.close();
		    	 stillRunning = false;
		    	 System.exit(1);
		     }
		     
		     commandParser.performCommand(input);
		 }
	}
}