package creationalpatterns;
import java.util.ArrayList;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.parsers.SAXParser;
import org.xml.sax.SAXException;


/**
 * @author Tony
 * @version 1.0
 * @created 08-Oct-2011 4:02:02 PM
 */
public class XMLMenu implements Menu {

    private InputStream _inputStream = null;
    private XMLHandler _xmlHandler = null;

    public ArrayList<MenuItem> _menuItems;
 

    public XMLMenu(){
        _xmlHandler = new XMLHandler(this);
        _menuItems = new ArrayList<MenuItem>();
        if(CheckForInput()) {
            ReadInput();
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public String getName(){
            return "";
    }

    public ArrayList<MenuItem> getMenuItems(){
        return _menuItems;
    }

        private boolean CheckForInput() {
        boolean rv = false;

        try {
            String s = System.getProperty("user.dir");
            s += "\\src\\creationalpatterns\\menu_items.xml";
            _inputStream = new FileInputStream(s);
            rv = true;

        } catch( Exception e) {
            System.err.println(e.getMessage());
        }

        return rv;
    }

    private void ReadInput() {
        //get a factory
        SAXParserFactory spf = SAXParserFactory.newInstance();
        try {
            //get a new instance of parser
            SAXParser sp = spf.newSAXParser();

            //parse the file and also register this class for call backs
            sp.parse(_inputStream, _xmlHandler);

        }catch(SAXException se) {
            se.printStackTrace();
        }catch(ParserConfigurationException pce) {
            pce.printStackTrace();
        }catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public void NewMenuItem(MenuItem menuItem) {
        _menuItems.add(menuItem);
    }
}