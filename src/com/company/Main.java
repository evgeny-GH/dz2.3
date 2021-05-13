package com.company;
/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив
        (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
        Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
        выводиться все телефоны. Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
        взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
*/


import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        
        HashMap<String,Integer > repeatColor = new HashMap<>();
        
	String[] color ={"red","red","red","blue","green","green","purple","gray","darkGray","Violet"," Black","Brown","Orange","Pink","Pink","Yellow"};
    for (String a:color){
        repeatColor.put(a, repeatColor.getOrDefault(a,0)+1);
    }
        System.out.println(repeatColor);
        System.out.println("====================================================");
        
        
        
        arrayList book = new arrayList();
        book.addContact("Вася", "71241412");
        book.addContact("Вася", "294834892");
        book.addContact("Миша", "27812");
        book.addContact("Рита", "93485");
        book.addContact("Сеня", "823782");
        book.addContact("Саша", "4435634");
    
        
        book.findAndPrint("Саша");
        book.findAndPrint("Сеня");
        book.findAndPrint("Вася");
    
    }
    
    
}
