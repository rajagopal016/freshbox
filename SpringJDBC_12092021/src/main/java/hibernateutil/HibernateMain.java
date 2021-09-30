package hibernateutil;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.Metadata;

import com.simplilearn.phase3.model.*;



import org.hibernate.Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class HibernateMain {

	public static void main(String[] args) throws ParseException {
		
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(EProduct.class);
		StandardServiceRegistryBuilder builder = new
		StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory =
		configuration.buildSessionFactory(builder.build()); 
		Session session = factory.openSession(); 
		Transaction transaction = session.beginTransaction();

	}
}
