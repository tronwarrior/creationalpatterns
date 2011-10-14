package creationalpatterns;

/**
 * This class (a) defines an Instance operation that lets clients access its
 * unique instance, and (b) may be responsible for creating its own unique
 * instance.
 * @version 1.0
 * @created 08-Oct-2011 4:24:07 PM
 */
public class CMenuFactory implements MenuFactory  {

    private static CMenuFactory _theFactory = null;
    private static Menu _uniqueInstance = null;
    private static Integer _refCount = 0;

    private CMenuFactory(){
    }

    @SuppressWarnings("FinalizeDeclaration")
    public void finalize() throws Throwable {
        if(--_refCount == 0) {
            _uniqueInstance = null;
        }

    }

    public static MenuFactory CreateMenuFactory() {
        if( _theFactory == null) {
            _theFactory = new CMenuFactory();
        }

        return _theFactory;
    }

    public Menu getMenu(){
        return Instance();
    }

    private static Menu Instance(){
        if( _uniqueInstance == null) {
            MenuCreator mc = new CMenuCreator();
            _uniqueInstance = mc.CreateMenu();
        }

        _refCount++;
        return _uniqueInstance;
    }
}