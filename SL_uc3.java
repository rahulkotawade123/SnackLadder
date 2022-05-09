package SnackLadder;

public class SL_uc3 {

	/**
	 * * The player then checks for a option. They are no play,Ladder or Snack.
	 * * use ((RANDOM))to check for options.
	 * * In case of no play the player stays in the same position.
	 * * In case of Ladder the player moves ahead by the number of position 
	 *     received in the die.
	 * * In case of snake the player moves behind by the number of position received
	 *     in the die
	 */
	public static int diceRoll () {
		int a = (int) (Math.floor(Math.random()*10)%6+1);
		return a;
		}
	
	public static int genratePlayerOption() {
		int b = (int) (Math.floor(Math.random()*10)%3+1);
		return b;	
	}
 public static void main(String[] args, Object res) {
		// TODO Auto-generated method stub
	 int playerPosition;
	 int startPosition = 0;
	 int diceValue = diceRoll();
     int optionPlayers = genratePlayerOption();
     
    int a = 0;
	int b = 0;
	switch (optionPlayers) {
     
     case 1: res = a+b;
       System.out.println(res+"play snake");
     //break;
     
     case 2: res = a-b;
       System.out.println(res+"play ladder");
     break;
     
     default: 
       System.out.println("position snake is zero");
     break;
     
     }		 
   }
}
