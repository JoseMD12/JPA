package br.com.alura.jose.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.jose.modelo.Produto;

public class ProdutoDAO {
    private EntityManager em;

    public ProdutoDAO(EntityManager em){
        this.em = em;
    }

    public void cadastra(Produto p){
        em.persist(p);
    }

    public void atualiza(Produto p){
        this.em.merge(p);
    }

    public void remove(Produto p){
        p = em.merge(p);
        this.em.remove(p);
    }

    public Produto buscaPorId(Long id){
        return em.find(Produto.class, id);
    }

    public List<Produto> buscaTodos(){
        return em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList(); //JPQL
    }
}
