/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21oopproba2;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author user
 */
public class SPTV21OOPProba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author author1 = new Author();
        author1.setFrstname("Aleksandr");
        author1.setLastname("pushkin");
        Author author2 = new Author();
        Author author3 = new Author();
        author3.setFrstname("Ilja");
        author3.setLastname("Ilf");
        author2.setFrstname("sergei");
        author2.setLastname("Petrov");
        Book book1= new Book();
        Book book2= new Book();
        book2.setCaption("golden bull");
        book1.setCaption("Jevheni Onegin");
        Author[] authors = new Author[1];
        authors[0]=author1;
        Author[] authors2 = new Author[1];
        authors[0]=author2;
        Author[] authors3 = new Author[1];
        authors[0]=author3;
        book1.setAuthors(authors);
        System.out.println(book1.toString());
    }
    
}
