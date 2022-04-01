package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class demotest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		project pp = new project();
		pp.setName("python");
		pp.setPid(2);
		tran.begin();
		manager.persist(pp);
		tran.commit();
	}

}
