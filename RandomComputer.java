/**RandomComputer class extends {@link Player}.
*Holds basic player methods inherited from the player class.
*Has extra method for Random computer behaviour.
*/
public class RandomComputer extends Player {
	/**Constructor method, gives computer player a name when initialised.
	*@param name	The name of the computer player.
	*/
	public RandomComputer(String name){
		this.name = name;
	}
	/** setName Method inherited from {@link Player} and can be used
	*to reset the name.
	*@param name	The name of the computer player.
	*/
	public void setName(String name){};
	/** getName Method inherited from {@link Player} and is used to
	*return the name.
	*@return name	The name of the computer.
	*/
	public  String getName(){
		return name;
	}
	/** giveCards Method used for giving the player cards at the start of
	*the game. Also inherited from {@link Player}.
	*/
	public void giveCards(){};
	/** takeTurn Method allows is used when the player is first to draw a card.
	*Uses the other methods of the computer classes to incorperate the Computer
	*player's decisions.
	*/
	public void takeTurn(){};
}