package ln.Spring.com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ln.Spring.com.pojos.Book;

@org.springframework.context.annotation.Configuration
@Repository
public class RecordDaoImp implements RecordDao {
	

	@Override
	public Book addRecords(Book book) {
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	  
	    session.save(book);
	    t.commit();
	    session.close(); 
		return book;
		
	}

	
	@Override
	@SuppressWarnings("unchecked")
	public List<Book> getlist() {
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	  
	    List<Book> books = session.createQuery("From Book").list();

        return books;
	}
	
	@Override
	public void deleteData(int bookId) {
		    Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml");  
		    
		    SessionFactory sf=cfg.buildSessionFactory();
		    Session session=sf.openSession();
		    Transaction t=session.beginTransaction();
	        /*Query query = session.createQuery("delete from Book where bookId = :bookId");
	        query.setString(bookId, "bookId");
	        query.executeUpdate();*/
		    
		    Book book=new Book();
		    book.setBookId(bookId);
		    
		    session.delete(book);
		    t.commit();
	    }


	@Override
	public Book editData(int bookId) {
		
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	    
	    
	    Criteria criteria = session.createCriteria(Book.class);
	    criteria.add(Restrictions.eq("bookId", bookId));
        Book book = (Book)criteria.uniqueResult();
        
        return book;
	    
	}


	@Override
	public Book updateRecord(Book book) {
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	  
	    session.update(book);
	    
	    t.commit();
	    session.close(); 
		return book;
	}


	@Override
	public Book searchData(String bookname) {
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	    
	    Criteria criteria = session.createCriteria(Book.class);
	    criteria.add(Restrictions.eq("bookName", bookname));
        Book book = (Book)criteria.uniqueResult();
        
        return book;
	}


	@Override
	public Book addReview(int bookId) {
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	    
	    
	    Criteria criteria = session.createCriteria(Book.class);
	    criteria.add(Restrictions.eq("bookId", bookId));
        Book book = (Book)criteria.uniqueResult();
        
        return book; 
	}

	@Override
	public Book updateReview(Book book) {
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	  
	    session.update(book);
	    
	    t.commit();
	    session.close(); 
		return book;
	}


	
}