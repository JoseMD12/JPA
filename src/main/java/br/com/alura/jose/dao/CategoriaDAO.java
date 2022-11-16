package br.com.alura.jose.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.jose.modelo.Categoria;

public class CategoriaDAO {
    private EntityManager em;

    public CategoriaDAO(EntityManager em){
        this.em = em;
    }

    public void cadastra(Categoria c){
        em.persist(c);
    }

    public void atualiza(Categoria c){
        this.em.merge(c);
    }

    public void remove(Categoria c){
        c = em.merge(c);
        this.em.remove(c);
    }

    public Categoria buscaPorId(Long id){
        return em.find (Categoria.class, id);
    }

    public List<Categoria> buscaTodos(){
        return em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList(); //JPQL
    }

    /**
     *  String nome = "eletrônicos";
     *  em.createQuery("SELECT c FROM Categoria c WHERE c.nome = ?1", Categoria.class).setParameter(1, nome);
     *  
     *  Setar o parâmetro com  ?1,  ?2,    ?3
     *                     ou :id, :nome, :descricao
     * 
     * 
     *  em.createQuery("...", ...).getSingleResult();
     *  Para retornar um resultado apenas
     */
   




}
