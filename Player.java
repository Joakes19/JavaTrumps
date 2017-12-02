public abstract class Player {
	/**public class main runs application
	*/
	protected String name;
	protected int cardCount;
	
	public abstract void giveCards();
	public abstract void setName(String name);
	public abstract String getName();
	public abstract void takeTurn();
	
}