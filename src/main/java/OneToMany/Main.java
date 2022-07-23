package OneToMany;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf  = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Que q1 = new Que();
		q1.setId(1);
		q1.setQuestion("WHat is JAVA ? ");
		
		Ans a1 = new Ans();
		a1.setId(1);
		a1.setAnswer("PL");

		Ans a2 = new Ans();
		a2.setId(2);
		a2.setAnswer("Big DATA");
		
		List<Ans> list  = new ArrayList<Ans>();
		list.add(a1);
		list.add(a2);
		
		q1.setAnswers(list);
		a1.setQuestion(q1);
		a2.setQuestion(q1);
		
		session.save(q1);
		session.save(a1);
		session.save(a2);
		
		
		tx.commit();
		session.close();
		sf.close();
		
	}

}
