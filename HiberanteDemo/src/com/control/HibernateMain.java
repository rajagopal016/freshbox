package com.control;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.transfer.PLayer;

public class HibernateMain {

	public static void main(String[] args) {
		try {

		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.transfer.PLayer.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		Transaction transcation = session.beginTransaction();
		PLayer p1 = new PLayer(7, "Rajag", "CSK", 27 );
		session.save(p1);
		transcation.commit();
		session.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
