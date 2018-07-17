
public class Level2 {

	public int blackjack(int cardA, int cardB) {
		if ((cardA <= 21 && cardB < cardA) ||cardA <= 21 && cardB > 21) {
			return cardA;
		}
		else if ((cardB <= 21 && cardA < cardB) ||cardB <= 21 && cardA > 21) {
			return cardB;
		}
		else {
			return 0;
		}
	}
	
	public int unique(int numA, int numB, int numC) {
		if (numA != numB && numA != numC && numB != numC) {
			return numA+numB+numC;
		}
		else if (numA == numB && numA != numC){
			return numC;
			
		}
		
		else if (numB == numC && numB != numA){
			return numA;
			
		}
		
		else if (numA == numC && numB != numC){
			return numB;
			
		}
		else {
			return 0;
		}
	}
	
}
