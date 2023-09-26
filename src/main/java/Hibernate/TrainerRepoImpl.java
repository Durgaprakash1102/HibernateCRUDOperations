package Hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TrainerRepoImpl implements TrainerRepo 
{
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("config.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sfactory=meta.buildSessionFactory();

		public void insertTrainer(Trainer t) 
		{
			Session session=sfactory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(t);
			transaction.commit();
			
		}

		public void updateTrainer(Trainer t) 
		{
			Session session=sfactory.openSession();
			Transaction transaction=session.beginTransaction();
			session.saveOrUpdate(t);
			transaction.commit();
			
		}

		public void deleteTrainer(Trainer t) 
		{
			Session session=sfactory.openSession();
			Transaction transaction=session.beginTransaction();
			session.delete(t);
			transaction.commit();
		}

		public void selectTrainers()
		{
			Session session=sfactory.openSession();
			TypedQuery tq=session.createQuery("from Trainer");
			List<Trainer> list=tq.getResultList();
			Iterator<Trainer> itr=list.iterator();
			 while(itr.hasNext())
				 System.out.println(itr.next());
			
		}

}