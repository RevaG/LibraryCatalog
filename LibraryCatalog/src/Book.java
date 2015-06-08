/**
 * GovenderPrj3
 * @author Revani Govender
 * Due 12/15/13
 * Book Class
 *
 */
public class Book {
	//field values
	private String author;
	private int pages;
	private boolean checkedOut;
	private String title;
	
	Book(){
		
	}
	/**
	 * Constructor for Book
	 * @param title
	 * @param author
	 * @param pages
	 */
	Book(String title, String author, int pages){
		this.title = title;
		this.author = author;
		this.pages = pages;
	}//end Book construct
	
	/**
	 * Setting Title
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}//end setTitle
	
	/**
	 * Getting Title
	 * @return title
	 */
	public String getTitle(){
		return title;
	}//end getTitle
	
	/**
	 * Setting Author
	 * @param author
	 */
	public void setAuthor(String author){
		this.author = author;	
	}//end setAuthor()
	
	/**
	 * Getting Author
	 * @return author
	 */
	public String getAuthor(){
		return author;
	}//end getAuthor()
	
	/**
	 * Setting Pages
	 * @param pages
	 */
	public void setPages(int pages){
		this.pages = pages;
	}//end setPages()
	
	/**
	 * Getting Pages
	 * @return
	 */
	public int getPages(){
		return pages;
	}//end getPages()
	
	/**
	 * Set checked out status of book
	 * @param checkedOut
	 */
	public void setCheckedOut(boolean checkedOut){
		this.checkedOut = checkedOut;
	}//end setCheckedOut()
	
	/**
	 * Get checked out status of book
	 * @return checkedOut boolean
	 */
	public boolean getCheckedOut(){
		return checkedOut;
	}//end getCheckedOut()
	
	/**
	 * Print column headers for book display
	 */
	public void print(){
		System.out.printf("%-1s %-30s %-30s %-3s %-7s %n",  
				"#" ,  "Title", "Author", "Pg", "Out?");

	}//end print()
}//end Book
