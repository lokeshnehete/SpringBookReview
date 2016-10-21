package ln.Spring.com.service;

import java.util.List;

import org.springframework.stereotype.Service;
import ln.Spring.com.pojos.Book;

@Service
public interface RecordService {

	public Book addRecords(Book book);

	/*public List<Book> listRecords(Book book);*/

	public List<Book> getlist();

	public void deleteData(int bookId);


	public Book editData(int bookId);

	public Book updateRecord(Book book);

	public Book searchData(String bookname);

	public Book addReview(int bookId);

	public Book updateReview(Book book);

	
	


}
