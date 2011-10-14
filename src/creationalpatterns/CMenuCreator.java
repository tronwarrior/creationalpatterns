/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package creationalpatterns;

/**
 *
 * @author Tony
 */
public class CMenuCreator implements MenuCreator {

    public Menu CreateMenu() {
        return new XMLMenu();
    }
}
