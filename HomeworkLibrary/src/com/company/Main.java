package com.company;

public class Main {

    public static void main(String[] args) {
        Book[] library = new Book[7];
        library[0] = new Book("Ромео и Джульета", "Уильям Шекспир");
        library[1] = new Book("Три мушкетера", "Александр Дюма", 1, 450);
        library[2] = new Book("Двадцать лет спустя", "Александр Дюма", 2, 450);
        library[3] = new Book("Виконт де Бражелон, или Десять лет спустя ", "Александр Дюма", 3, 450);
    	library[4] = new Book("Ночь в Лиссабоне", "Эрих Мария Ремарк", 250);
    	library[5] = new Book("Понедельник начинается в субботу", "Борис и Аркадий Стругацкие", 300);
    	library[6] = new Book("Божественная комедия", "Данте Алигьери");

    	Reader reader = new Reader();

    	Book choosenBook  = reader.choiceBook(library);
		reader.readBook(choosenBook);
		reader.rateBook(choosenBook);
    }
}
