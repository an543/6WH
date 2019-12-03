// CS 113-103
// Andy Nguyen
// Homework 4 a / class file


public class Book
{
    private int pages;       // store # pages in the book
    private String title;    // represents the title of the book

public Book (int pages, String title){

	this.pages = pages;
	this.title = title;



}
	public void setPages(int numPage, String nameTitle)
	{

    	pages = numPage;
    	title = nameTitle;


}

public int getPages()
{
	return pages;

}
public String getTitle()
{
	return title;
}

    public String toString()
   {

	   return "The book information is: " + title +", and : " + pages;

   }

public boolean equalBooks(Book book1)

{
	boolean bReturn = false;

	if(this.title.equals(book1.title)&& this.pages == book1.pages )
	{
		bReturn = true;

	}
return bReturn;

}
public int compareTo(Book book)

{
	int numReturn = -1;
	if (this. pages > book.pages)

		numReturn = 1;

	if (this.pages == book.pages)

		numReturn = 0;
		return numReturn;

}

    }