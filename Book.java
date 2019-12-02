public class Book {

    private int pages;
    private String title;

    public Book(){}

    public Book (int pages, String title) {
        this.pages = pages;
        this.title = title;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString()
    {
        return title + " " + pages;
    }

    public boolean equals(String i, int p) {

        if ((title.equals(i)) && (pages == p)) {
            return true;
        }
        else {
            return false;
        }
    }

    public int compareTo(Book i) {

        int pages1 = i.getPages();

        if (pages < pages1) {
            return -1;
        }
        else if (pages > pages1) {
            return 1;
        }
        else {
            return 0;
        }
    }

}