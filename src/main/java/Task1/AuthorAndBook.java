package Task1;

import java.util.Scanner;

public class AuthorAndBook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String emAutor;
        System.out.print("emails = ");
        emAutor=scanner.nextLine();
        Author author=new Author("Kevin",emAutor,'M');
        Book book=new Book("The Good Story",author,24.25,10);
        author.setEmail(emAutor);
        System.out.println(author.toString());
        System.out.println(book.toString());
    }

}
