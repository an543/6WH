import java.util.Scanner;

public class BookLibrary {

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String option, title;
        int i = 0, pages;

        Book[] library = new Book[10];

        System.out.println("Menu)\n A. Add Book\n B. Delete Book\n C. Change Book Info\n");

        while (i <= 9) {
            System.out.print("Select Option: ");
            option = scan.next();

            switch (option) {
                case "A":
                    System.out.print("Enter Title: ");
                    title = scan.next();
                    System.out.print("Enter Pages: ");
                    pages = scan.nextInt();

                    //Initializes a new Book object and assigns its reference to that index
                    library[i] = new Book(pages, title);
                    i++;
                    break;
                case "B":
                    break;
                case "C":
                    break;
                default:


            }
        }
        System.out.println(library[0].toString());

    }
}
