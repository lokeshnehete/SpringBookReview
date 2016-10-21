package ln.Spring.com.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ln.Spring.com.pojos.Book;
import ln.Spring.com.service.RecordService;

@Controller
public class RecordController {
	
	@Autowired
	private RecordService recordservice;
	
	public RecordController(){
		System.out.println("RecordController called");
	}
	
	@RequestMapping(value="addrecords")
	public String addRecords(Book book){
		recordservice.addRecords(book);
		return "dashboard";
	}
	
	@RequestMapping(value="recordsPage")
	public ModelAndView listofbook(){
		System.out.println("in records Page");
		ModelAndView mav=new ModelAndView("recordsPageView");
		List<Book> books = recordservice.getlist();
		mav.addObject("books", books);
		return mav;
	}

	@RequestMapping(value="delete/{bookId}")
	public String deleteData(@PathVariable int bookId){
		recordservice.deleteData(bookId);
		String message = "Data was successfully deleted.";
		return "redirect:/recordsPage";
	}
	
	@RequestMapping(value="edit/{bookId}")
	public ModelAndView editData(@PathVariable int bookId) {
		ModelAndView modelAndView = new ModelAndView("editPage");
		Book book=recordservice.editData(bookId);
		System.out.println(book.toString());
		modelAndView.addObject("book", book);
		return modelAndView;
    }
	
	@RequestMapping(value="edit/{bookId}/update")
	public String updateData(Book book){
		recordservice.updateRecord(book);
		return "redirect:/recordsPage";
	}
	
	@RequestMapping(value="search")
	public ModelAndView searchData(@RequestParam("bookname") String bookname ){
		System.out.println(bookname);
		ModelAndView modelAndView = new ModelAndView("resultPage");
		Book book=recordservice.searchData(bookname);
		System.out.println(book.toString());
		modelAndView.addObject("book", book);
		return modelAndView;
	}
	
	@RequestMapping(value="addReview/{bookId}")
	public ModelAndView addReview(@PathVariable int bookId) {
		ModelAndView modelAndView = new ModelAndView("reviewPage");
		Book book=recordservice.addReview(bookId);
		System.out.println(book.toString());
		modelAndView.addObject("book", book);
		return modelAndView;
    }
	
	@RequestMapping(value="review/{bookId}/update")
	public String updateReview(Book book){
		recordservice.updateReview(book);
		return "redirect:/welcomePage";
	}
	
}