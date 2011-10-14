/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package creationalpatterns;

import org.xml.sax.helpers.*;
import javax.xml.parsers.*;
import org.xml.sax.*;

/**
 *
 * @author Tony
 */
public class XMLHandler extends DefaultHandler {

    private XMLMenu _menu = null;
    private XMLMenuItem _menuItem = null;

    public XMLHandler(XMLMenu mf) {
        _menu = mf;
    }

    /*
    * Called when the Parser starts parsing the Current XML File.
    */
    public void startDocument () throws SAXException
    {
        System.out.println("XMLHandler::startDocument");
    }

    /*
     *Called when the Parser Completes parsing the Current XML File.
    */
    public void endDocument () throws SAXException
    {
        System.out.println("XMLHandler::endDocument");
    }

    /*
     * Called when the starting of the Element is reached. For Example if we have Tag
     * called <Title> ... </Title>, then this method is called when <Title> tag is
     * Encountered while parsing the Current XML File. The AttributeList Parameter has
     * the list of all Attributes declared for the Current Element in the XML File.
    */
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
    {
        System.out.println("XMLHandler::startElement - " + qName + ": " + attributes.getValue("name"));
        switch(qName) {
            case "menu_item":
                _menuItem = new XMLMenuItem(attributes.getValue("name"));
                break;
            case "category":
                XMLCategory c = new XMLCategory(attributes.getValue("name"));
                _menuItem.setCategory(c);
                break;
            case "ingredient":
                XMLIngredient i = new XMLIngredient(attributes.getValue("name"));
                _menuItem.setIngredient(i);

                break;
            default:

                break;
        }

    }
    
    /*
     * Called when the Ending of the current Element is reached. For example in the
     * above explanation, this method is called when </Title> tag is reached
    */
    public void endElement(String uri, String localName, String qName)  throws SAXException
    {
        System.out.println("XMLHandler::endElement - " + qName);

        if(qName == "menu_item") {
            _menu.NewMenuItem(_menuItem);
            _menuItem = null;
        }
    }

    /*
     * While Parsing the XML file, if extra characters like space or enter Character
     * are encountered then this method is called. If you don't want to do anything
     * special with these characters, then you can normally leave this method blank.
    */
    public void characters (char buf [], int offset, int len) throws SAXException
    {
    }

    /*
     * In the XML File if the parser encounters a Processing Instruction which is
     * declared like this  <?ProgramName:BooksLib QUERY="author, isbn, price"?>
     * Then this method is called where Target parameter will have
     * "ProgramName:BooksLib" and data parameter will have  QUERY="author, isbn,
     *  price". You can invoke a External Program from this Method if required.
    */
    public void processingInstruction (String target, String data) throws SAXException
    {
    }
}
