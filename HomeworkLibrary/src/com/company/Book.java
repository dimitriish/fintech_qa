package com.company;

public class Book {
    String name;
    String author;
    int numberInSeries;
    int numberOfPages;

    public Book(String name, String author, int numberInSeries, int numberOfPages){
        this.name = name;
        this.author = author;
        this.numberInSeries = numberInSeries;
        this.numberOfPages = numberOfPages;
    }

    public Book(String name, String author,  int numberOfPages){
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Выбранная книга \n" +
                "Название: " + name + ",\n" +
                "Автор: " + author + ",\n" +
                "Номер в серии: " + numberInSeries +",\n"+
                "Количество страниц: " + numberOfPages + "\n";
    }
}
