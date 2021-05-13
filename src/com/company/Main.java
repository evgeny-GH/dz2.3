package com.company;

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
