/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autopecas.persistencia;

import autopecas.logica.Produto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.ScrollableResults;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Ruan
 */
public class ProdutoDao extends FonteDeDados {
    private SessionFactory sessions;
    private static Criteria crit;
    private static ScrollableResults cursor;
   // private Session sessao;


    public ProdutoDao(){
    
    }


    public void salvarProduto(Produto p){
        try{
           sessions = config.buildSessionFactory();
           Session session = sessions.openSession();
           Transaction tx = session.beginTransaction();
           session.save(p);
           tx.commit();
           session.close();
       } catch(Exception e){
           e.printStackTrace();
       }
    }
    public List<Produto> pesquisaProdutoDaoNome(String nome){
        sessions = config.buildSessionFactory();
        Session session =  sessions.openSession();
        crit=session.createCriteria(Produto.class);
        crit.add(Restrictions.ilike("nomeProduto", "%"+nome+"%"));
         return crit.list();
        }   
    }