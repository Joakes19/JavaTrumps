/**util used for scanner
*/
import java.util.*;
/**io used for reading inputs from the user
*/
import java.io.*;
/**io used for reading inputs from the user and using them in the program.
*/
import java.text.*;
/**The Game class holds all of the setup methods as well as methods for game logic and interactions between players.
*/
public class Game {
	/**The number of human players in the game.
	*/
	int nHumans;
	/**The number of computer players in the game.
	*/
	int nComputers;
	/**The total number of human players + computer players.
	*/
	int nPlayers = -1;
	/**The deck chosen by the user (The name as a stirng).
	*/
	String selectedDeckType;
	/**The decks that the user can choose from.
	*/
	String[] availableDeckTypes = {"Cars", "Planes", "Animals"};
	/**The list of players in the game as an ArrayList.
	*/
	ArrayList<Player> playerList = new ArrayList<Player>();
	/**Scanner for recieving user input in the setup proccess and the game.
	*/
	Scanner userInput = new Scanner(System.in);
	/**setup allows user to choose the game's options.
	*includes nHumans, nComputers, nPlayers and methods {@link Game#nameInput()}, {@link Game#addComputers()}
	*and {@link Game#selectDeckType()}.
	*at the end of setup, the method calls {@link Game#gameInitialPhase()} and transitions to this method.
	*/
	 void setup(){
		playerList.clear();
		System.out.printf("Welcome To the card game! \n\n========Add Players========\nPlease enter the number of human players in you game: ");
		while(nPlayers == -1 && !userInput.hasNextInt()){
				System.out.printf("That was not a valid input, please try again: ");	
				userInput.next();
		}
		nHumans = userInput.nextInt();
		System.out.printf("Please enter the number of computer players in you game: ");
		while(nPlayers == -1 && !userInput.hasNextInt()){
				System.out.printf("That was not a valid input, please try again: ");	
				userInput.next();
		}
		nComputers = userInput.nextInt();
		nPlayers = nHumans + nComputers;	
		nameInput();
		addComputers();
		selectDeckType();
		System.out.println("\n========Player List========");
		for(int i = 0; i < playerList.size(); i++){
			System.out.println(playerList.get(i).getName());
		}
		System.out.println("\nSelected Deck: " + selectedDeckType);
		System.out.println("\nAre you okay with these settings? (y/n): ");
		String answer = userInput.next();
			while(!answer.toUpperCase().equals("Y") && !answer.toUpperCase().equals("N") ){
				System.out.printf("You did not enter y or n: ");
				answer = userInput.next();
			};
			if(answer.toUpperCase().equals("N")){
				setup();
			} 
		gameInitialPhase();
	}
		/** Allows users to enter their name.
		*/
		void nameInput(){
			for(int i = 0; i < nHumans; i++){
				System.out.printf("Please Enter a name for player " + (i+1) + " : ");
				String humanCount = "player" + i;
				playerList.add(new Human(userInput.next()));
			}
			for(int i = 0; i < nHumans; i++){
				System.out.println("Player " + (i+1) + " = " + playerList.get(i).getName());
			}
			System.out.printf("This this correct? (y/n): ");
			String answer = userInput.next();
			while(!answer.toUpperCase().equals("Y") && !answer.toUpperCase().equals("N") ){
				System.out.printf("You did not enter y or n: ");
				answer = userInput.next();
			};
			if(answer.toUpperCase().equals("N")){
				nameInputRetry();
			} 
		}
		/** Allows users to change their name if they choose to after the first entry.
		*/
		void nameInputRetry(){
			for(int i = 0; i < nHumans; i++){
				System.out.printf("Please Enter a name for player " + (i+1) + " : ");
				String humanCount = "player" + i;
				playerList.get(i).setName(userInput.next());
			}
			for(int i = 0; i < nHumans; i++){
				System.out.println("Player " + (i+1) + " = " + playerList.get(i).getName());
			}
			System.out.printf("This this correct? (y/n): ");
			String answer = userInput.next();
			while(!answer.toUpperCase().equals("Y") && !answer.toUpperCase().equals("N") ){
				System.out.printf("You did not enter y or n: ");
				answer = userInput.next();
			};
			if(answer.toUpperCase().equals("N")){
				nameInputRetry();
			} 
		}
		/**addComputers allows the user to add computers to their game selecting from 3 difficulty settings.
		*/
		void addComputers(){
			int compDifficultyInput = -1;
			String compName;
			System.out.println("\n========Computer Difficulty========");
			for(int i = 0; i < nComputers; i++){
				compDifficultyInput = -1;
				System.out.printf("Please selec the difficulty of Computer player " + (i+1) +
				"\n(Random = 0) (Smart = 1) (Predictable = 2): ");
				while(compDifficultyInput != 0 && compDifficultyInput != 1 && compDifficultyInput != 2 && !userInput.hasNextInt()){
					try{compDifficultyInput = userInput.nextInt();
						
					} catch(Exception e){
						System.out.printf("That was not a valid input, please try again!: ");
						userInput.next();
					}
				}
				compDifficultyInput = userInput.nextInt();
				 
				switch(compDifficultyInput){
					case 0:
						compName = "Computer " + i + " (Random)";
						playerList.add(new RandomComputer(compName));
						break;
					case 1:
						compName = "Computer " + i + " (Smart)";
						playerList.add(new SmartComputer(compName));
						break;
					case 2:
						compName = "Computer " + i + " (Predictable)";
						playerList.add(new PredictableComputer(compName));
						break;
				}		
			}
		}
		/**selectDeckType allows the user to choose a deck for their game.
		*/
		void selectDeckType(){
			System.out.println("\n========Deck Type========\nPlease Select the Deck Type you would like to use: ");
			for(int i = 0; i < availableDeckTypes.length; i++){
				System.out.println((i+1) + ") " + availableDeckTypes[i]);
			}
			System.out.printf("1 = Cars, 2 = Planes etc: ");
			while(nPlayers == -1 && !userInput.hasNextInt()){
				System.out.printf("That was not a valid input, please try again: ");	
				userInput.next();
			}
			selectedDeckType = availableDeckTypes[userInput.nextInt() - 1];
		}
		/**gameInitialPhase begins the initial phase of the game.
		*It deals the cards and chooses a starting player.
		*/
		void gameInitialPhase(){
			
			
			
		}
}