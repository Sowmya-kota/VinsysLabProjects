import java.io.*;
import java.util.*;
class Book 
{
    private String name;
    private int isbn;
    private String author;
    private String publisher;

    public Book() 
    {
        name = "NULL";
        isbn = 0;
        author = "NULL";
        publisher = "NULL";
    }
    public Book(String name, int isbn, String author, String publisher) 
    {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getName() 
    {
        return name;
    }
    public void setISBN(int isbn) 
    {
        this.isbn = isbn;
    }
    public int getISBN() 
    {
        return isbn;
    }
    public void setAuth(String author)
    {
        this.author = author;
    }
    public String getAuthor() 
    {
        return author;
    }
    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }
    public String getPublisher() 
    {
        return publisher;
    }
    public String getBookInfo()
    {
        String info = "Name"+ name+"ISBN number"+isbn+"Author"+author+"Publisher"+publisher;
        return info;
    }
}
public class BookTest 
{
    public static void main(String[] args) 
    {
        String name,author,publisher;
        int ISBN_number;
        Scanner in = new Scanner(System.in);
        Book[] test = new Book[30];
        System.out.print("Enter the books data\nType -1 to break\n");
        for(int i=0;i<30;i++)
        {
            System.out.printf("Book %d\n",(i+1));
            System.out.println("Enter the book name");
            name=in.next();
            
            System.out.println("Enter the ISBN number");
            ISBN_number = in.nextInt();
            
            System.out.println("Enter the book author");
            author=in.next();
            
            System.out.println("Enter the publisher");
            publisher=in.next();
            
            test[i] = new Book(name,ISBN_number,author,publisher);
        }
        for(int i=0;i<30;i++)
        {
            System.out.printf("Book %d",(i+1));
            System.out.printf("%s\n",test[i].getBookInfo());
        }
    }
}
