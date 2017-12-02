import java.math.*;
import java.util.*;
/**Card class used to create a deck of cards with attributes. Uses methods from {@link Attribute} to
*to make the attributes.
*/
public class Card {
	
	String cardType;
	int noOfAttributes;
	int min = 1;
	int max = 10;
	ArrayList<Attribute> attributeList = new ArrayList<Attribute>();
	/**Constructor method creates the card with a type to know what deck type the user has
	*chosen.
	*@param type	The type of the deck used by the user given to create a set of cards of that type.
	*/
	public Card(String type){
		cardType = type;
		createAttributes();	
	}
	/**createAttributes used to create the attributes for each card individually.
	*/
	void createAttributes(){
		switch(cardType){
			case "Cars":
				attributeList.add(new Attribute("Top Speed", min + (int)(Math.random() * max)));
				attributeList.add(new Attribute("Acceleration", min + (int)(Math.random() * max)));
				attributeList.add(new Attribute("Handling", min + (int)(Math.random() * max)));
				attributeList.add(new Attribute("Brakes", min + (int)(Math.random() * max)));
				
				//for(int i = 0; i < attributeList.size(); i ++){
				//System.out.println(attributeList.get(i).getName()+ " " + attributeList.get(i).getValue());
				//}
				break;
			case "Planes":
				attributeList.add(new Attribute("Top Speed", min + (int)(Math.random() * max)));
				attributeList.add(new Attribute("Engine Power", min + (int)(Math.random() * max)));
				attributeList.add(new Attribute("Max Flight Height", min + (int)(Math.random() * max)));
				attributeList.add(new Attribute("Size", min + (int)(Math.random() * max)));
				attributeList.add(new Attribute("Capacity", min + (int)(Math.random() * max)));
				
				
				
				break;
			case "Animals":
				attributeList.add(new Attribute("Top Speed", min + (int)(Math.random() * max)));
				attributeList.add(new Attribute("Size", min + (int)(Math.random() * max)));
				attributeList.add(new Attribute("Adaptability", min + (int)(Math.random() * max)));
				attributeList.add(new Attribute("Dexterity", min + (int)(Math.random() * max)));
				attributeList.add(new Attribute("Poise", min + (int)(Math.random() * max)));
				
				
				break;
			
			
		}
	}
}