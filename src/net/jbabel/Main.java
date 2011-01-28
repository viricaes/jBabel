/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.jbabel;

import net.jbabel.core.DB;


/**
 *
 * @author victor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        DB.getInstance().getEmConfig().getTransaction().begin();
        DB.getInstance().getEmConfig().getTransaction().commit();
        DB.getInstance().close();
    }

}
