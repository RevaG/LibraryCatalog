/**
 * GovenderPrj3
 * @author Revani Govender
 * Due 12/15/13
 * Main Method -
 * Program will be a library to keep track of books
 * Program will keep track of checked out status and sort books
 *
 */
import java.io.*;
import java.util.*;
public class GovenderPrj3 {
	private static LibraryCatalog catalog;
	
	/**
	 * Main method to call menu and add books and read user input
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException{
		LibraryCatalog catalog = new LibraryCatalog();
		
		File file = new File ("BookList2.txt");
		Scanner input = new Scanner(file);	
		
		//while the file has a next line
		while(input.hasNextLine()){
			//add the line, then split the line
			String line = input.nextLine();
			String[] values = line.split(",");
			
			//convert the values to string or int
			String titleBook = values[values.length -3];
			String authorBook = values[values.length - 2];
			String pageBook = values[values.length -1];
			int pagesBook = Integer.parseInt(pageBook);
			
			//assign the values to a book value using the LibraryCatalog
			Book book = new Book(titleBook, authorBook, pagesBook);
			catalog.addBook(book);
		}
		String menuChoice = null;
		final String EXIT_OPTION = "5";
			
		//while exit option not chosen
		while (menuChoice!=EXIT_OPTION){
			menuChoice = displayMenu();
			
			switch (menuChoice){
				//case 1 = check out a book
				case "1":
					Scanner input1 = new Scanner(System.in);
					System.out.print("Select a book number: ");
					int bookNumber = input1.nextInt();
					catalog.checkoutBook(bookNumber);
					break;
				//case 2 = return a book
				case "2":
					Scanner input2 = new Scanner(System.in);
					System.out.print("Select a book number: ");
					int bookNumber2 = input2.nextInt();
					catalog.returnBook(bookNumber2);
					break;
				//case 3 = print all books
				case "3":	
					catalog.printBooks();
					break;
				//case 4 = sort books
				case "4":
					Book book = new Book();
					catalog.sortBooks(book);
					break;
				//case 5 = exit option
				case "5":
					menuChoice=EXIT_OPTION;
					System.out.println("Goodbye!");
					break;
				//all other input = invalid choice and redisplay
				default:
					System.out.println("Invalid choice. \n");
					
			}//end switch menuChoice		
		}//end while not exit option
	}//end main
	
	/**
	 * Menu display method will return user choice
	 * @return menuChoice
	 */
	public static String displayMenu(){
		//start scanner
		Scanner input = new Scanner(System.in);
		//menu options
		System.out.print("Main menu: \n"
				+ "1. Checkout a book \n"
				+ "2. Return a book \n"
				+ "3. Print all books \n"
				+ "4. Sort books \n"
				+ "5. Exit \n"
				+ "\n"
				+ "Choice: ");
		String menuChoice = input.nextLine();
		
		return menuChoice;
	}//end displayMenu()

}//end GovenderPrj3
