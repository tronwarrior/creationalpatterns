package creationalpatterns;

/**
 * @author Tony
 * @version 1.0
 * @created 08-Oct-2011 4:01:59 PM
 */
public class XMLCategory implements Category {

    private String _name;
    
    public XMLCategory(String name){
        _name = name;
    }

    public void finalize() throws Throwable {

    }

    public String getName(){
        return _name;
    }

}