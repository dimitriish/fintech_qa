package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String num = "+7 (989) 89 89 89 88";
        String changes = "";
        String newstr;
        newstr = num.replace("+7", "8");
        if(!newstr.equals(num)) changes+="Замена +7 на 8; ";
        num = newstr;

        num = num.replace("\u0020", "");
        num = num.replace("(", "");
        num = num.replace(")", "");
        if(!newstr.equals(num)) changes+="В номере есть пробелы и/или скобки; ";




        if(!(num.length()==11)){
            num = "Введен некорректный номер";
            changes+="Сумма символов не равна 11  ";
        }

        System.out.println(num);
        if(changes.equals("")){
            System.out.println("Не было изменений");
        }else {
            changes = changes.substring(0, changes.length()-2);
            System.out.println(changes);
        }

    }
}
