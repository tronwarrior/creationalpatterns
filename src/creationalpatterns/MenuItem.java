package creationalpatterns;

/**
 * @author Tony
 * @version 1.0
 * @created 08-Oct-2011 4:01:56 PM
 */
public interface MenuItem {

	/**
	 * 
	 * @param category
	 */
	public void setCategory(Category category);

	public Category getCategory();

	/**
	 * 
	 * @param ingredient
	 */
	public void setIngredient(Ingredient ingredient);

	/**
	 * 
	 * @param ingredient
	 */
	public void removeIngredient(Ingredient ingredient);

	public abstract Ingredient[] getIngredients();

}