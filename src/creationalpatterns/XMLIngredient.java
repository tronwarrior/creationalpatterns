package creationalpatterns;

/**
 * @author Tony
 * @version 1.0
 * @created 08-Oct-2011 4:02:01 PM
 */
public class XMLIngredient implements Ingredient {

    String _name;

    public XMLIngredient(String name){
        _name = name;
    }

    public void finalize() throws Throwable {

    }

    public String getName(){
        return _name;
    }

}