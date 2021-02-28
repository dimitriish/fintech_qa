package com.company;

import java.util.Random;

public class Reader {
    Random random = new Random();

    public Book choiceBook(Book[] books) {

        return books[random.nextInt(books.length - 1)];
    }

    public void readBook(Book book) {
        System.out.println(book.toString());
    }

    public void rateBook(Book book) {
        int rate = book.name.replace(" ", "").length() +
                book.author.replace(" ", "").length() -
                book.numberInSeries +
                book.numberOfPages;


        //Проверяем на незаполненность только поля numberInSeries и numberOfPages,
        //потому что остальные не могут быть пустыми
        if (book.numberInSeries == 0) {
            rate -= random.nextInt(200);
        }

        if (book.numberOfPages == 0) {
            rate -= random.nextInt(200);
        }

        System.out.println("Оценка книги: " + rate + " Пушкиных из 10");
    }

}
