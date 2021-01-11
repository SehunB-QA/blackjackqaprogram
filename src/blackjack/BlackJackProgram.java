package blackjack;

public class BlackJackProgram {
	
	int higherHand;
	
	public int BlackJackGame(int playerOneHand, int playerTwoHand)
	{	
		if(playerOneHand > 21 && playerTwoHand > 21)
		{
			
			System.out.println("You both went bust!");
			return 0;
			
		}
		
		if(playerOneHand > 21)
		{
			
			System.out.println("Player One went bust!");
			System.out.println("Player Two wins!");
			return 0;
			
		}
		
		if(playerOneHand  <= 0 || playerTwoHand <= 0 )
		{
			System.out.println("Can't draw lower than a 1, try again!");
		}
		
		
		if(playerTwoHand > 21)
		{
			
			System.out.println("Player Two went bust!");
			System.out.println("Player One wins!");
			return 0;
			
		}
		
		 
		if(playerOneHand > playerTwoHand  )
		{
			higherHand = playerOneHand; 
			System.out.println("Player One wins with a hand of: "  + playerOneHand);
			return higherHand;
			
		}
		
		if(playerTwoHand > playerOneHand)
		{
			higherHand = playerTwoHand;
			System.out.println("Player Two wins with a hand of: "  + playerTwoHand);
			return higherHand;
			
		}
		
		
		if(playerOneHand == playerTwoHand || playerTwoHand == playerOneHand)
		{
			System.out.println("It's a tie! Draw again.");
			return 0;
		}
		
	    return  higherHand;
	}

}
