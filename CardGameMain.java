/**@author James Oakes
*@version 0.9
*public class CardGameMain runs application
*/
public class CardGameMain {
	
	/**main creates instance of {@link Game} and runs {@link Game#setup} from that instance.
	*@param args	Arguements for main.
	*/
	public static void main(String[] args){
		Game cardgame1 = new Game();
		cardgame1.setup();
	}
}