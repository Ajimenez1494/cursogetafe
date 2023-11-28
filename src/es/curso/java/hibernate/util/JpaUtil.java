package es.curso.java.hibernate.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil { 
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory(){
       // return Persistence.createEntityManagerFactory("ejemploHibernate");
    	return Persistence.createEntityManagerFactory("Oracle");
    }

    public static EntityManager getEntityManager() { 
        return entityManagerFactory.createEntityManager();
    }
}
