package creationalpatterns;

import java.util.ArrayList;
/**
 * @author Tony
 * @version 1.0
 * @created 08-Oct-2011 4:02:03 PM
 */
public class XMLMenuItem implements MenuItem {

    private String _name;
    private XMLCategory _category;
    private ArrayList<Ingredient> _ingredients;

    public XMLMenuItem(String name){
        _name = name;
        _ingredients = new ArrayList<Ingredient>();
    }

    public void finalize() throws Throwable {

    }

    public String getName(){
        return _name;
    }

    /**
     *
     * @param category
     */
    public void setCategory(Category category){
        _category = (XMLCategory)category;
    }

    public Category getCategory(){
        return _category;
    }

    /**
     *
     * @param ingredient
     */
    public void setIngredient(Ingredient ingredient){
        _ingredients.add(ingredient);
    }

    /**
     *
     * @param ingredient
     */
    public void removeIngredient(Ingredient ingredient){
        _ingredients.remove(ingredient);
    }

    public ArrayList<Ingredient> getIngredients(){
        return _ingredients;
    }

}