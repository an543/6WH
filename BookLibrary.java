import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class BookLibrary {
    public static void main(String[] args) {

		Book [] myBook = new Book [10]; // Set up the array for 10 books

		Scanner keyboard = new Scanner(System.in);


		System.out.println("Enter 1 for Add, 2 for Delete, 3 for Change, 4 to End: ");
		String answer = keyboard.nextLine();
		int counter = 0;
		int z = 0;
		while (true) {
			switch(answer.toUpperCase())
			{
				case "Add":


						for (Book book : myBook) {
							counter = counter + 1;
						}
						if (counter == 10) {
							System.out.println("Library full");
						}
						System.out.println("Enter Title: ");
						String title = keyboard.nextLine();
						for (int i = 0; i < myBook.length; i++) {
							if (title == myBook[i].getTitle()) {
								System.out.println("No Duplicated Books Titles Are Allowed");
								break;
							}
							else {
								z++;
							}
						}
						if (z < myBook.length) {
						System.out.println("Enter number of pages: ");
						int pages = keyboard.nextInt();

						//myBook[z + 1] = new Book(title, pages);
					}


					break;

					case "Delete":



						if (myBook.length == 0) {
							System.out.println("Library is empty");
						}
						System.out.println("Enter title of book: ");
						String title2 = keyboard.nextLine();
						for (int d = 0; d < myBook.length; d++) {
							if (title2 == myBook[d].getTitle())
								// Delete book
								System.out.println("Deleted book: " + title2);
							else
								System.out.println("Book does not exist");
						}

					break;
					case "Change":

						if (myBook.length == 0) {
							System.out.println("Library is empty.");
						} else {
							System.out.println("Enter book title: ");

							String title3 = keyboard.nextLine();
							for (int y = 0; y < myBook.length; y++) {
								if (title3 != myBook[y].getTitle())
									continue;
								else {
									System.out.println("Enter number of pages: ");
									int pages = keyboard.nextInt();
									//myBook[y] = new Book(title3, pages);
								}
							}
						}
				}
					String[] StringList = new String[10];
					for (int y = 0; y < myBook.length; y++) {
						StringList[y] = myBook[y].getTitle();
					}
					Arrays.sort(StringList);
					for (String bookt : StringList) {
						System.out.println(bookt + myBook);
					}
					break;


	}

}








}




