/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.matriculacore.jpa;

import dijalmasilva.matriculacore.entidades.Aluno;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class AlunoDaoImpl implements AlunoDao {

    private final EntityManagerFactory factory;
    private final EntityManager em;
    private final CriteriaBuilder builder;
    
    public AlunoDaoImpl() {
        this.factory = Persistence.createEntityManagerFactory("sistemaifpb");
        this.em = factory.createEntityManager();
        this.builder = em.getCriteriaBuilder();
    }
    
    @Override
    public boolean save(Aluno a) {
        try{
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
            return true;
            
        }catch(Exception ex){
            System.out.println("CPF inválido!");
            return false;
        }
    }

    @Override
    public List<Aluno> findAll() {
        CriteriaQuery<Aluno> criteria = builder.createQuery(Aluno.class);
        Root<Aluno> from = criteria.from(Aluno.class);
        TypedQuery<Aluno> query = em.createQuery(criteria.select(from));
        return query.getResultList();
    }

}
