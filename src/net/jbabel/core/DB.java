/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.jbabel.core;

import javax.persistence.*;
import java.util.*;


/**
 *
 * @author vorian
 */
public class DB {
    private static EntityManagerFactory emfConfig;
    private static EntityManager emConfig;

    private DB() {
        emfConfig =
            Persistence.createEntityManagerFactory("$objectdb/db/config.odb");
        emConfig = emfConfig.createEntityManager();
    }

    public static DB getInstance() {
        return DBHolder.INSTANCE;
    }

    private static class DBHolder {
        private static final DB INSTANCE = new DB();
    }

    public EntityManagerFactory getEmfConfig() {
        return emfConfig;
    }

    public EntityManager getEmConfig() {
        return emConfig;
    }

    public void close() {
        emConfig.close();
        emfConfig.close();
    }
 }
