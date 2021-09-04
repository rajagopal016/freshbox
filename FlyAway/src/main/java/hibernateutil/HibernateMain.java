package hibernateutil;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.Metadata;  
import com.User;



import org.hibernate.Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class HibernateMain {

	public static void main(String[] args) throws ParseException {
		
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.User.class);
		StandardServiceRegistryBuilder builder = new
		StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory =
		configuration.buildSessionFactory(builder.build()); 
		Session session = factory.openSession(); 
		Transaction transaction = session.beginTransaction();

		String sDate1="31-12-1998";
		Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
		User u1 = new User(2,"Raja", "123", "rk136", "das@fd.com", 123456789, date1 , "city");
		session.save(u1);
		transaction.commit();
		session.close();
	}
}
