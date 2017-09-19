/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entidades.CPF;
import entidades.Pessoa;
import entidades.Sexo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rudan
 */
public class Loader {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MapeamentosPU");
        EntityManager entityManager = emf.createEntityManager();
        
        List<String> telefones = new ArrayList<>();
        telefones.add("4002-8922");
        
        CPF cpf = new CPF("63210000");
        
        Pessoa p = new Pessoa("Rudan", 19, Sexo.MASCULINO, LocalDate.now(), telefones, cpf);
        
        entityManager.getTransaction().begin();
        entityManager.persist(p);
        entityManager.getTransaction().commit();
    }
}
