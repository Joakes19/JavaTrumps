/**Attribute class holds data about the attributes of the cards.
*Mainly used for return methods and creation of attributes.
*Holds the variables for the Name of the attribute as well as the value of that attribute.
*Holds the methods getName() and getValue()
*/
public class Attribute {
	String name;
	int value;
	/**Constructor method, given values for name and value of attribute.
	*These values are given by {@link Card#createAttributes()}
	*@param name  The Name of the attribute
	*@param value  The Value of the attribute (Integer values only)
	*/
	public Attribute(String name, int value){
		this.name = name;
		this.value = value;
	}
	/**Returns the name of the attribute
	*@return name	The Name of the attribute
	*/
	String getName(){
		return name;
	}
	/**Returns the value of the attribute
	*@return name	The value of the attribute
	*/
	int getValue(){
		return value;
	}
	
}