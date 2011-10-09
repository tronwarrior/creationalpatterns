package creationalpatterns;
import java.util.ArrayList;

/**
 * @author Tony
 * @version 1.0
 * @created 08-Oct-2011 4:01:55 PM
 */
public interface Menu {
	public abstract String getName();
	public abstract ArrayList<MenuItem> getMenuItems();
}