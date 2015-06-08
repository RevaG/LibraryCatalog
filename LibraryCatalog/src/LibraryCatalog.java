/**
 * GovenderPrj3
 * @author Revani Govender
 * Due 12/15/13
 * Library Catalog Class
 *
 */
import java.io.*;
import java.util.*;


public class LibraryCatalog {
	private Book [] books;
	
	public LibraryCatalog(){
		books = new Book[10];
	}//end constructor LibraryCatalog
	
	/**
	 * Add book if there is a position available
	 * @param book
	 * @throws FileNotFoundException
	 */
	public void addBook(Book book) throws FileNotFoundException{
			
		boolean slotFound = false;
		for (int j = 0; j < books.length && !slotFound; ++j){
			if (books[j] == null){
				slotFound = true;
				books[j] = book;
				}//end if
			}//end for
		}//end addBook
		
	public void printBooks(){
		books[0].print();
		//print books if they are found
		boolean bookFound = true;
		for(int j = 0; j < books.length && bookFound; j++){	
			if(books[j] != null){
				System.out.printf("%-1s %-30s %-30s %-3s %-7s %n",  j + 1 ,  
						books[j].getTitle(), books[j].getAuthor(), books[j].getPages(), books[j].getCheckedOut());
				}//end if
			else{
				bookFound = false;	
			}//end else
		}//end for			
	}//end printBooks
	
	/**
	 * 
	 * @param bookNumber
	 */
	public void checkoutBook(int bookNumber){
		
		//if book is already checked out, then display message
		if (books[bookNumber-1].getCheckedOut() == true){
			System.out.println("The book is already checked out. \n"
					+ "Please make another choice. \n");
			}//end if
		//if book is not checked out, change status and display message
		if (books[bookNumber-1].getCheckedOut()==false){
			books[bookNumber-1].setCheckedOut(true);
			System.out.println("Book checked out! \n");
			}//end if
		
	}//end checkoutBook
	/**
	 * 
	 * @param bookNumber2
	 */
	public void returnBook(int bookNumber2){
		//if book is not checked out then display that book cannot be returned
		if (books[bookNumber2-1].getCheckedOut()==false){
			System.out.println("This book is not checked out and cannot be returned. \n"
					+ "Please make another choice. \n");
			}//end if
		else{
			//if the book is checked out (checked out is true) change status and display message
		books[bookNumber2-1].setCheckedOut(false);
		System.out.println("Book returned! \n");
			}//end else
	}//end returnBook
	
	/**
	 * Bubble sort for Books
	 * @param book
	 */
	public void sortBooks(Book book){
		boolean sorting = true;

		while(sorting){
				sorting = false;
				//run through all books at least once
					for (int j = 0; j <books.length-1; j++){
		
						//make sure both instances of book[] are not null
						if (books[j] != null && books[j+1] != null){
							//assign variables
							Book b1 = books[j];
							Book b2 = books[j+1];
							
							String title1 = b1.getTitle();
							String title2 = b2.getTitle();
							
							//comparing books
							int result = title1.compareTo(title2);
						if (result>0){ //if title 1 > title 2

							Book temp = b1;
							books[j] = b2; //swap values
							books[j+1] = temp;
							sorting = true; //change sorting back to true to recheck
							
					}//end if(result)
				}//end if(nulls)
			}//end for
		}//end while
	}//end sortBooks
}//end class
