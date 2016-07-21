package ln.Spring.com.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	private int bookId;
	private String bookName;
	private String bookAuther;
	private String bookReview;
	public Book() {
		
	}
	public Book(int bookId, String bookName, String bookAuther, String bookReview) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuther = bookAuther;
		this.bookReview = bookReview;
	}
	public int getBookId() {
		return bookId;
	}
	@Id
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuther() {
		return bookAuther;
	}
	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
	}
	public String getBookReview() {
		return bookReview;
	}
	public void setBookReview(String bookReview) {
		this.bookReview = bookReview;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuther=" + bookAuther + ", bookReview="
				+ bookReview + "]";
	}
	
	

}
