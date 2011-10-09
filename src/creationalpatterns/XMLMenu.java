package creationalpatterns;
import java.util.ArrayList;

/**
 * @author Tony
 * @version 1.0
 * @created 08-Oct-2011 4:02:02 PM
 */
public class XMLMenu implements Menu {

	public MenuItem m_MenuItem;
	public CMenuItemElementCreator m_CMenuItemElementCreator;

	public XMLMenu(){

	}

	public void finalize() throws Throwable {

	}

	public String getName(){
		return "";
	}

	public ArrayList<MenuItem> getMenuItems(){
		return null;
	}

}