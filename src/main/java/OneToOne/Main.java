package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernateCore.Student;
public class Main {
	public static void main(String[] args) {
		SessionFactory sf  = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Question q1 = new Question();
		q1.setId(1);
		q1.setQuestion("What is JAVA ?");
		
		Answer a1 = new Answer();
		a1.setId(1);
		a1.setAnswer("JAVA IS PL");
		
		q1.setAns(a1);
		a1.setQue(q1);
		
		session.save(q1);
		session.save(a1);
		
		tx.commit();
		session.close();
		sf.close();
	}

}
