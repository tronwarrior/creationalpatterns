package creationalpatterns;

/**
 * This class (a) defines an Instance operation that lets clients access its
 * unique instance, and (b) may be responsible for creating its own unique
 * instance.
 * @version 1.0
 * @created 08-Oct-2011 4:24:07 PM
 */
public class CMenuFactory implements MenuFactory {

    private static XMLMenu _uniqueInstance;
    private static Integer _refCount = 0;

    public CMenuFactory(){

    }

    @SuppressWarnings("FinalizeDeclaration")
    public void finalize() throws Throwable {
        if(--_refCount == 0) {
            _uniqueInstance = null;
        }

    }

    public Menu getMenu(){
            return null;
    }

    private static XMLMenu Instance(){
        if( _uniqueInstance == null) {
            _uniqueInstance = new XMLMenu();
        }
        _refCount++;
        return _uniqueInstance;
    }

}