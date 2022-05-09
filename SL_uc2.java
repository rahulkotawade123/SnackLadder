package SnackLadder;

public class SL_uc2 {

	/**
	 * The player rolls the die to get a number between 1 to 6
	 * use((RANDOM))to get the number between 1 to 6
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int player_1 = 1;
		int player_2 = 6;
		int playerPosition = 0;
		
		System.out.println("Wecome To Snake Ladder Program");
         
		int dice = (int) (Math.floor(Math.random()*10)%6+1);
		
		System.out.println("Player Position:"+dice);
	}
}
