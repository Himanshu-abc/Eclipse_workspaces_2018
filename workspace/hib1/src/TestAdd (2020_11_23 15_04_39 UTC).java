

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prodev.entity.Student;

public class TestAdd {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
	Student st=new Student();
	st.setRollNo(11);
	st.setName("Shyam");
	st.setFees(2500);
	Transaction tx= session.beginTransaction();
	session.save(st);
	tx.commit();
		session.close();
		sf.close();
System.out.println("Done");
	}

}
