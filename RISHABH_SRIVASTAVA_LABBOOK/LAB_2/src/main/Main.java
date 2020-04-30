package main;

import bean.Author;
import bean.Book;
import dao.AuthorDao;
import dao.BookDao;

public class Main {
    public static void main(String args[]) {
        // Author created here
       AuthorDao ad=new AuthorDao();
//        Author author1=new Author();
//        author1.setFirstName("Rishabh");
//        author1.setMiddleName("");
//        author1.setLastName("Srivastava");
//        author1.setPhoneNo("9876543209");
//        String res=ad.createAuthor(author1);
//        System.out.println(res);

        //Find the author by  Id
//       AuthorDao sd=new AuthorDao();
//       Author au=sd.findAuthorById(0);
//       System.out.println(au);

        //Author deteled by id
//        AuthorDao sd=new AuthorDao();
//        String res=sd.deleteAuthor(0);
//        System.out.println(res);

        //upadte the author details
//        AuthorDao sd=new AuthorDao();
//        String aut=sd.updateAuthor(1,"Dark","","Warrior","1234567890");
//        System.out.println(aut);

        //Details of book
//        BookDao bd=new BookDao();
//
//        Book b1=new Book();
//        b1.setISBN(1001);
//        b1.setPrice(700);
//        b1.setTitle("The Lone Wolf");
//        String res1=bd.createBook(b1);
//        System.out.println(res1);
//        Book b2=new Book();
//        b2.setISBN(1002);
//        b2.setPrice(800);
//        b2.setTitle("Demon King");
//        String res2=bd.createBook(b2);
//        System.out.println(res2);

        //Get all list of books
//        BookDao bd=new BookDao();
//        List<Book> list=bd.getAllBooks();
//        for(Book i:list)
//        {
//            System.out.println(i);
//        }
        //Get the list of book between any price range
//        BookDao bd=new BookDao();
//        List<Book> li=bd.between(500,700);
//        for(Book i:li)
//        {
//            System.out.println(i);
//        }
//        EntityManager em= MyFactory.getEntityManager();
//        EntityTransaction tx=em.getTransaction();
//        tx.begin();
//        Author au=new Author(10,"Dark","Warrior","rs","0987654321");
//        List<Book> li=new ArrayList<Book>();
//        li.add(new Book("DK",850));
//        li.add(new Book("SINS",900));
//        li.add(new Book("HEIST",950));
//       au.setBook(li);
//       em.persist(au);
//        Author a=em.find(Author.class,10);
//        System.out.println(a);
//        System.out.println("================books===============");
//        for(Book b:a.getBook())
//        {
//            System.out.println(b);
//        }
//       tx.commit();
//       System.out.println("Added!");


//        AuthorDao ad=new AuthorDao();
//        Author a=new Author(12,"Ravi","RAJ","KUMAR","8745124512");
//        List<Book> li=new ArrayList<Book>();
//        li.add(new Book("INDIAN ECONOMY",850,a));
//        li.add(new Book("SPECTRUM",450,a));
//        li.add(new Book("MODERN HISTORY",950,a));
//        a.setBook(li);
//        String result=ad.createAuthor(a);
//        System.out.println(result);


        //b.Query all books written by given author Id
//        AuthorDao ad=new AuthorDao();
//        Author a=ad.findAuthorById(12);
//        System.out.println(a.getBook());
//        for(Book i:a.getBook())
//        {
//            System.out.println(i.getTitle());
//        }


        //List the author name for given book id.
//        BookDao bd=new BookDao();
//        Book b=bd.findBookAuthorById(1001);
//        System.out.println(b.getAuthor());

   }
}
