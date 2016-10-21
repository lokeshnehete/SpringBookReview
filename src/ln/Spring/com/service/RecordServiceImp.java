package ln.Spring.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ln.Spring.com.dao.RecordDao;
import ln.Spring.com.pojos.Book;

@Service
public class RecordServiceImp implements RecordService {

	@Autowired 
	private RecordDao recordDao;
	
	@Override
	public Book addRecords(Book book) {	
		return recordDao.addRecords(book);
	}

	@Override
	public List<Book> getlist() {
		return recordDao.getlist();
	}

	@Override
	public void deleteData(int bookId) {
		recordDao.deleteData(bookId);
		
	}

	@Override
	public Book editData(int bookId) {
		return recordDao.editData(bookId);
	}

	@Override
	public Book updateRecord(Book book) {
		return recordDao.updateRecord(book);	
	}

	@Override
	public Book searchData(String bookname) {	
		return  recordDao.searchData(bookname);
	}

	@Override
	public Book addReview(int bookId) {
		return recordDao.addReview(bookId);
	}

	@Override
	public Book updateReview(Book book) {
		return recordDao.updateReview(book);
	}	
}
