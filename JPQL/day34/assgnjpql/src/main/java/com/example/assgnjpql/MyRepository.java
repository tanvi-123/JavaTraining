package com.example.assgnjpql;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
//import java.awt.List;
import org.springframework.stereotype.Repository;

//import antlr.collections.List;

@Repository
public class MyRepository {

	@PersistenceUnit
	private EntityManagerFactory emf;

	void getData() {
		EntityManager em;
		em = emf.createEntityManager();

//		 update
		em.getTransaction().begin();
		
		String jsql="";
		
		jsql="update Student e set e.name='testing'"
				+ " where e.id=100";
		Query q;
		q=em.createQuery(jsql);
		q.executeUpdate();
		

		em.getTransaction().commit();

	
		// delete
		em.getTransaction().begin();
		
		String sql="";
		
		jsql="delete from Student e where e.id=400";
		Query q1;
		q1=em.createQuery(sql);
		q1.executeUpdate();
		em.getTransaction().commit();
		
		// select

		em.getTransaction().begin();
		String jsql1 = "";
        jsql1="select e from Student as e";
//		jsql1 = "select e from Student as e where e.id=400";
        Query q2;
		q = em.createQuery(jsql1);
        
		em.getTransaction().commit();

	}
}
