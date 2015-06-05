package cards;	

public class cards {
	enum Rank {king, ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen}

	public static void main(String[] args) {
	
	
	Rank highCard, faceCard, card1, card2;
	int card1Val, card2Val;
	
    highCard = Rank.ace;
    faceCard = Rank.king;
    card1 = Rank.two;
    card2 = Rank.eight;
    card1Val = card1.ordinal();
    card2Val = card2.ordinal();
    
    System.out.print("A blackjack hand: " + highCard + " and " + faceCard );
    System.out.println("");
    System.out.print("A two card hand: " + card1.name() + " " + card2.name());
    System.out.println("");
    System.out.print("Hand value:" + (card1Val + card2Val));
    
    				
	}

}
