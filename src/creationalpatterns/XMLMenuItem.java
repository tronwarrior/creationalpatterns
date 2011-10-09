package creationalpatterns;

/**
 * @author Tony
 * @version 1.0
 * @created 08-Oct-2011 4:02:03 PM
 */
public class XMLMenuItem implements MenuItemElement, MenuItem {

	public XMLIngredient m_XMLIngredient;
	public XMLCategory m_XMLCategory;

	public XMLMenuItem(){

	}

	public void finalize() throws Throwable {

	}

	public String getName(){
		return "";
	}

	/**
	 * 
	 * @param category
	 */
	public void setCategory(Category category){

	}

	public Category getCategory(){
		return null;
	}

	/**
	 * 
	 * @param ingredient
	 */
	public void setIngredient(Ingredient ingredient){

	}

	/**
	 * 
	 * @param ingredient
	 */
	public void removeIngredient(Ingredient ingredient){

	}

	public Ingredient[] getIngredients(){
		return null;
	}

}