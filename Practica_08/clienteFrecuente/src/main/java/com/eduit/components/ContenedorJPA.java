/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.components;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.stereotype.Component;


/**
 *
 * @author Reisel
 */
@Component
public class ContenedorJPA {
    private EntityManager entityManager;
    
    public ContenedorJPA(){
        
        //Referencia al archivo persistence en Other Sources META-INF
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("mariadb");
        
        entityManager = factory.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
