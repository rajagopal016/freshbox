package hibernateutil;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.boot.Metadata;

import com.Booking;
import com.User;
import com.Flight;


import org.hibernate.Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class UserDAO {

	public static int register(User u) {
		
		  Configuration configuration = new Configuration().configure();
		  configuration.addAnnotatedClass(com.User.class);
		  StandardServiceRegistryBuilder builder = new
		  StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		  SessionFactory factory =
		  configuration.buildSessionFactory(builder.build()); 
		  Session session = factory.openSession(); 
		  Transaction transaction = session.beginTransaction();
		  try{
			  int userRegistrationStatus = (int) session.save(u);
			  transaction.commit();
			  return userRegistrationStatus;
		  }
		  catch(Exception e){
			  return 0;
		  }
		  finally{
			  session.close();
		  }
		  
	}
	
	public boolean validate(String userName, String password) {

		  Configuration configuration = new Configuration().configure();
		  configuration.addAnnotatedClass(com.User.class);
		  StandardServiceRegistryBuilder builder = new
		  StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		  SessionFactory factory =
		  configuration.buildSessionFactory(builder.build()); 
		  Session session = factory.openSession(); 
		  Transaction transaction = session.beginTransaction();
            // get an user object
         User user = (User) session.createQuery("FROM User U WHERE U.username = :userName").setParameter("userName", userName)
            .uniqueResult();

        if (user != null && user.getPassword().equals(password)) {
        	
            return true;
        }
        // commit transaction
        transaction.commit();

    return false;
    }
	
	public boolean changepassword(String userName, String password) {

		  Configuration configuration = new Configuration().configure();
		  configuration.addAnnotatedClass(com.User.class);
		  StandardServiceRegistryBuilder builder = new
		  StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		  SessionFactory factory =
		  configuration.buildSessionFactory(builder.build()); 
		  Session session = factory.openSession(); 
		  Transaction transaction = session.beginTransaction();
          // get an user object
		  try{
			  User user = (User) session.createQuery("FROM User U WHERE U.username = :userName").setParameter("userName", userName).uniqueResult();
			  user.setPassword(password);
			  transaction.commit();
			  return true;
		  }catch(Exception e){
			  return false;
		  }

  }
	
	public List <Flight> searchTheFlight(String source, String destination, int day, int number) {

		  Configuration configuration = new Configuration().configure();
		  configuration.addAnnotatedClass(com.Flight.class);
		  StandardServiceRegistryBuilder builder = new
		  StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		  SessionFactory factory =
		  configuration.buildSessionFactory(builder.build()); 
		  Session session = factory.openSession(); 
		  Transaction transaction = session.beginTransaction();
		  try{
			  
			  //Flight f1 = (Flight) session.createQuery("FROM Flight f WHERE f.sourcePlace = :source").setParameter("source", source).uniqueResult();
			  Query q = session.createQuery("FROM Flight f WHERE f.sourcePlace = :source AND f.destinationPlace = :destination AND f.dayOfOperation = :day AND f.seatsLeft >= :number ");
			  q.setParameter("source", source);
			  q.setParameter("destination", destination);
			  q.setParameter("day", day);
			  q.setParameter("number", number);
			  List <Flight> flightsAvailable = q.list();
			  transaction.commit();
			  return flightsAvailable;
		  }catch(Exception e){
			  System.out.println(e.getMessage());
			  
		  }
		return null;

}

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}
}
