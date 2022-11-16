package br.com.alura.jose;

import javax.persistence.EntityManager;

import br.com.alura.jose.dao.ProdutoDAO;
import br.com.alura.jose.modelo.Produto;
import br.com.alura.jose.util.FactoryEM;

public class App 
{
    public static void main( String[] args ){
        Produto p1 = new Produto(null, null, null);

        EntityManager em = FactoryEM.getEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        em.getTransaction().begin();
        produtoDAO.cadastra(p1);
        em.getTransaction().commit();
        em.close();
    }
}
