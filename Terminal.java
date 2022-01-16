
import java.util.Scanner;

public class Terminal {
	
  private static Human human;
  private static Bank bank;
  private static String userInput;
  private static boolean _run = true;
  public static String clrCode = "\033[H\033[2J";
	private	static String command = "";
	static Scanner scan = new Scanner(System.in);
	
	public static String cmdText() {
		command = scan.nextLine().toLowerCase();
		return command;
	}
	public static void writeText(String txt) {
		System.out.println(txt);
	}
	public static void clrScreen() {
		System.out.println(clrCode);
	}
	
	/*
	public static String searchAfter(String str) {
		String strPt = "^" + str; 
		Pattern pattern = Pattern.compile(str, Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(command);
		return "";
	}
	*/

private static int handle_input ( String cmd ) {


	switch (cmd.toLowerCase()) {
		case "human":
			human.EnterTerminal();
			break;

		case "list":
			bank.displayLedger(0, 0);
			break;
		
		case "funds":
			bank.getFunds();
			break;
		
	}
    /*
	if (cmd.equals("human") ) {
      human.EnterTerminal();
    }

    if (cmd.equals("cure") ) {

      
      
    }
	*/
	

   // if (cmd.equals("") ) {}

    return 1;
  }
	public Terminal(Human _human) {

    human = _human;

	}
	public static void run() {


    while (_run) {
      userInput = cmdText();
      handle_input (userInput);
    }
		
	}
};

