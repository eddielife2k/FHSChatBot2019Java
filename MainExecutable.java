// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// This program has been altered and expanded by members of the 2019-2020 FHS Computer Club.
// This the main executeable which will serve the chatbot by allowing it to greet the user, and say farewell.
// Other ideas will be placed in separate files and will be called using this executable.

import java.util.Scanner;
import java.util.ArrayList;
public class MainExecutable
{
	public static void main(String[] args)
	{
		FHSChatBot panther = new FHSChatBot();

		System.out.println (panther.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
    		statement = statement.toLowerCase();    
		while (!statement.equals("bye"))
		{
			System.out.println(panther.getResponse(statement));
			statement = in.nextLine().toLowerCase();
		}
	}
}
