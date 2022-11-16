package br.com.alura.jose.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactoryEM {
     private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("loja_virtual");

     public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
     }
     
}
     
