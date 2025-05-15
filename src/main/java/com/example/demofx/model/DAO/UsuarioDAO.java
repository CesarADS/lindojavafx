package com.example.demofx.model.DAO;

import com.example.demofx.model.Usuario;
import jakarta.persistence.EntityManager;

public class UsuarioDAO {

    private EntityManager em;

    public UsuarioDAO(EntityManager em){
        this.em = em;
    }

    public void salvar(Usuario usuario) {
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }

}
