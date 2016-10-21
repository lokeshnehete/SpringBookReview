package ln.Spring.com.dao;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import ln.Spring.com.pojos.Book;

@Configuration
@Repository
public interface RecordDao {
	public List<Book> getlist();
	

	public Book addRecords(Book book);


	public void deleteData(int bookId);


	public Book editData(int bookId);


	public Book updateRecord(Book book);


	public Book searchData(String bookname);


	public Book addReview(int bookId);


	public Book updateReview(Book book);


	


	


	


	
	
}
