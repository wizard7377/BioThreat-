public class Bank {
	
	private int funds = 100;
	public String ledgerHistory[];

	public boolean useMoney(int cost) {
		if (cost > funds) {
			System.out.println("You don't have enough money : $" + Integer.toString(funds));
			return false;
		} else {
			System.out.println("Bought!");
			addToLedger(cost, true);
			return true;
		}

	}
	public String getFundsMsg() {
		return ("You have " + Integer.toString(funds) + " dollars");
	}
	public int getFunds() {
		return funds;
	}
	public void earnMoney(int amount) {
		funds += amount;
		addToLedger(amount, false);
		return;
	}
	public void displayLedger(int beginIn, int endIn) {
		if (endIn == 0)	{endIn = ledgerHistory.length;}
		for (int i = 0; i < endIn - beginIn; i++) {
			System.out.println(ledgerHistory[beginIn + i]);
		}
	}
	private void addToLedger(int amount, boolean buy) {
		
			//String oldHis[] = ledgerHistory;
			//ledgerHistory = new String[ledgerHistory.length + 1];
		if (buy) {
				//ledgerHistory = {oldHis, "Paid: $" + Integer.toString(amount)};
			ledgerHistory = (new String[]{ledgerHistory + "You paid: $" + Integer.toString(amount)});
		} else {
			ledgerHistory = (new String[]{ledgerHistory + "You earned: $" + Integer.toString(amount)});
		}
	
	}
	private void addToLedger(int amount) {
		
			//String oldHis[] = ledgerHistory;
			//ledgerHistory = new String[ledgerHistory.length + 1];
		if (amount < 0) {
				//ledgerHistory = {oldHis, "Paid: $" + Integer.toString(amount)};
			ledgerHistory = (new String[]{ledgerHistory + "You paid: $" + Integer.toString(amount * -1)});
		} else {
			ledgerHistory = (new String[]{ledgerHistory + "You earned: $" + Integer.toString(amount)});
		}
	
	}

};